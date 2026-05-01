package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNordVpn: ImageVector
    get() {
        if (_brandNordVpn != null) return _brandNordVpn!!
        _brandNordVpn = tablerOutlineIcon(
            name = "BrandNordVpn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.992f, 15.0f),
                    PathNode.LineTo(7.985f, 12.0f),
                    PathNode.LineTo(3.97f, 20.0f),
                    PathNode.CurveTo(1.758f, 16.939f, 1.345f, 12.902f, 3.055f, 9.537f),
                    PathNode.CurveTo(4.771183f, 6.168004f, 8.219221f, 4.033651f, 12.0f, 4.0f),
                    PathNode.CurveTo(15.780779f, 4.033651f, 19.228815f, 6.168004f, 20.945f, 9.537f),
                    PathNode.CurveTo(22.655f, 12.902f, 22.242f, 16.939f, 20.03f, 20.0f),
                    PathNode.LineTo(15.513f, 12.0f),
                    PathNode.LineTo(14.008f, 13.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.5f, 15.0f),
                    PathNode.LineTo(11.5f, 9.0f),
                    PathNode.LineTo(9.0f, 13.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandNordVpn!!
    }

private var _brandNordVpn: ImageVector? = null
