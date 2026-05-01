package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSurfshark: ImageVector
    get() {
        if (_brandSurfshark != null) return _brandSurfshark!!
        _brandSurfshark = tablerOutlineIcon(
            name = "BrandSurfshark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.954f, 9.447f),
                    PathNode.CurveTo(19.717f, 3.23f, 19.954f, 3.23f, 13.954f, 3.022f),
                    PathNode.CurveTo(8.180001f, 2.814f, 7.13f, 4.022f, 6.044f, 8.404f),
                    PathNode.CurveTo(3.16f, 20.22f, 2.199f, 23.12f, 10.836f, 19.602f),
                    PathNode.CurveTo(20.228f, 15.771f, 20.133f, 14.22f, 19.95f, 9.447f),
                    PathNode.LineTo(19.954f, 9.447f)
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
                    PathNode.MoveTo(8.0f, 16.0f),
                    PathNode.LineTo(8.452f, 16.0f),
                    PathNode.CurveTo(10.395f, 16.007f, 11.978f, 14.539f, 11.995f, 12.714f),
                    PathNode.LineTo(11.995f, 10.286f),
                    PathNode.CurveTo(12.013f, 8.458f, 13.602f, 6.988f, 15.548f, 7.0f),
                    PathNode.LineTo(16.0f, 7.0f)
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
        return _brandSurfshark!!
    }

private var _brandSurfshark: ImageVector? = null
