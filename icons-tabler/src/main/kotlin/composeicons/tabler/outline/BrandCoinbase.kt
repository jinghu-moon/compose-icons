package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCoinbase: ImageVector
    get() {
        if (_brandCoinbase != null) return _brandCoinbase!!
        _brandCoinbase = tablerOutlineIcon(
            name = "BrandCoinbase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.95f, 22.0f),
                    PathNode.CurveTo(8.447f, 22.0f, 4.505f, 18.96f, 3.34f, 14.587f),
                    PathNode.CurveTo(2.175f, 10.214f, 4.077f, 5.599f, 7.978f, 3.337f),
                    PathNode.CurveTo(11.877943f, 1.075056f, 16.813341f, 1.731848f, 19.986f, 4.935f),
                    PathNode.LineTo(16.651f, 8.302f),
                    PathNode.CurveTo(15.676042f, 7.32481f, 14.351673f, 6.776723f, 12.971296f, 6.779163f),
                    PathNode.CurveTo(11.59092f, 6.781603f, 10.268497f, 7.334369f, 9.297f, 8.315f),
                    PathNode.CurveTo(7.268827f, 10.362031f, 7.268827f, 13.660969f, 9.297f, 15.708f),
                    PathNode.CurveTo(10.268497f, 16.688631f, 11.59092f, 17.241398f, 12.971296f, 17.243837f),
                    PathNode.CurveTo(14.351673f, 17.246277f, 15.676042f, 16.69819f, 16.651f, 15.721f),
                    PathNode.LineTo(20.0f, 19.088f),
                    PathNode.CurveTo(18.134102f, 20.962585f, 15.594903f, 22.0114f, 12.95f, 22.0f)
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
        return _brandCoinbase!!
    }

private var _brandCoinbase: ImageVector? = null
