package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSharik: ImageVector
    get() {
        if (_brandSharik != null) return _brandSharik!!
        _brandSharik = tablerOutlineIcon(
            name = "BrandSharik",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.281f, 16.606f),
                    PathNode.CurveTo(2.155998f, 13.069139f, 2.718531f, 8.538751f, 5.644f, 5.629f),
                    PathNode.CurveTo(8.574166f, 2.714095f, 13.108963f, 2.159756f, 16.655f, 4.283f),
                    PathNode.CurveTo(15.071f, 8.975f, 14.24f, 11.243f, 12.0f, 13.0f),
                    PathNode.CurveTo(10.416f, 14.242f, 8.164f, 15.24f, 4.281f, 16.606f),
                    PathNode.MoveTo(20.616f, 9.3f),
                    PathNode.CurveTo(22.729f, 16.89f, 15.724f, 22.661f, 9.314f, 20.564f),
                    PathNode.CurveTo(11.245f, 17.464f, 12.549f, 15.958f, 14.0f, 14.499f),
                    PathNode.CurveTo(15.705f, 12.784f, 17.591f, 11.269f, 20.616f, 9.3f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandSharik!!
    }

private var _brandSharik: ImageVector? = null
