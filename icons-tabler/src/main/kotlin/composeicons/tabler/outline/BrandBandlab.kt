package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBandlab: ImageVector
    get() {
        if (_brandBandlab != null) return _brandBandlab!!
        _brandBandlab = tablerOutlineIcon(
            name = "BrandBandlab",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.885f, 7.0f),
                    PathNode.LineTo(4.349f, 11.907f),
                    PathNode.CurveTo(2.328f, 15.752f, 1.85f, 20.682f, 8.17f, 21.0f),
                    PathNode.LineTo(14.978f, 21.0f),
                    PathNode.CurveTo(19.838f, 20.793f, 22.967f, 18.025f, 19.585f, 11.907f),
                    PathNode.LineTo(16.597f, 7.0f)
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
                    PathNode.MoveTo(15.078f, 4.0f),
                    PathNode.LineTo(9.942f, 4.0f),
                    PathNode.LineTo(13.62f, 12.768f),
                    PathNode.CurveTo(14.167f, 13.908f, 14.467f, 14.59f, 13.782f, 15.444f),
                    PathNode.CurveTo(13.729f, 15.537f, 12.45f, 17.351f, 10.729f, 16.939f),
                    PathNode.CurveTo(9.904f, 16.752f, 9.345f, 16.013f, 9.409f, 15.199f),
                    PathNode.CurveTo(9.449f, 14.289f, 10.029f, 13.482f, 10.897f, 13.125f),
                    PathNode.CurveTo(11.744473f, 12.722411f, 12.697268f, 12.597145f, 13.62f, 12.767f)
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
        return _brandBandlab!!
    }

private var _brandBandlab: ImageVector? = null
