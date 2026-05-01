package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSentry: ImageVector
    get() {
        if (_brandSentry != null) return _brandSentry!!
        _brandSentry = tablerOutlineIcon(
            name = "BrandSentry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 18.0f),
                    PathNode.CurveTo(2.993539f, 18.38101f, 3.100012f, 18.755407f, 3.306f, 19.076f),
                    PathNode.CurveTo(3.653369f, 19.622177f, 4.243587f, 19.96647f, 4.89f, 20.0f),
                    PathNode.CurveTo(5.536f, 20.033f, 4.353f, 20.0f, 5.0f, 20.0f),
                    PathNode.LineTo(8.0f, 20.0f),
                    PathNode.CurveTo(7.999545f, 17.75636f, 6.502296f, 15.788664f, 4.34f, 15.19f),
                    PathNode.CurveTo(4.898f, 14.217f, 5.58f, 13.041f, 6.38f, 11.659f),
                    PathNode.CurveTo(9.777035f, 13.035538f, 11.999919f, 16.334661f, 12.0f, 20.0f),
                    PathNode.LineTo(16.0f, 20.0f),
                    PathNode.CurveTo(16.663f, 20.0f, 18.337f, 20.0f, 19.0f, 20.0f),
                    PathNode.CurveTo(19.662535f, 19.995352f, 20.279768f, 19.662897f, 20.648209f, 19.112238f),
                    PathNode.CurveTo(21.01665f, 18.561579f, 21.088472f, 17.864195f, 20.84f, 17.25f),
                    PathNode.LineTo(13.74f, 5.0f),
                    PathNode.CurveTo(13.387762f, 4.363369f, 12.717579f, 3.968246f, 11.99f, 3.968246f),
                    PathNode.CurveTo(11.262421f, 3.968246f, 10.592237f, 4.363369f, 10.24f, 5.0f),
                    PathNode.LineTo(8.4f, 8.176f),
                    PathNode.CurveTo(12.882f, 10.226f, 16.0f, 14.747f, 16.0f, 20.0f)
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
        return _brandSentry!!
    }

private var _brandSentry: ImageVector? = null
