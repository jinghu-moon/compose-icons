package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDolbyDigital: ImageVector
    get() {
        if (_brandDolbyDigital != null) return _brandDolbyDigital!!
        _brandDolbyDigital = tablerOutlineIcon(
            name = "BrandDolbyDigital",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 6.0f),
                    PathNode.LineTo(21.0f, 18.0f),
                    PathNode.LineTo(20.11f, 18.0f),
                    PathNode.CurveTo(16.77f, 18.0f, 14.063f, 15.314f, 14.063f, 12.0f),
                    PathNode.CurveTo(14.063f, 8.686f, 16.77f, 6.0f, 20.109f, 6.0f),
                    PathNode.LineTo(21.0f, 6.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.063f, 6.0f),
                    PathNode.LineTo(3.063f, 18.0f),
                    PathNode.LineTo(3.954f, 18.0f),
                    PathNode.CurveTo(7.294f, 18.0f, 10.0f, 15.314f, 10.0f, 12.0f),
                    PathNode.CurveTo(10.0f, 8.686f, 7.293f, 6.0f, 3.954f, 6.0f),
                    PathNode.LineTo(3.064f, 6.0f)
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
        return _brandDolbyDigital!!
    }

private var _brandDolbyDigital: ImageVector? = null
