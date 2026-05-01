package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.EggFried: ImageVector
    get() {
        if (_eggFried != null) return _eggFried!!
        _eggFried = tablerFilledIcon(
            name = "EggFried",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.001f, 1.996f),
                    PathNode.QuadTo(14.061f, 1.996f, 14.118f, 2.003f),
                    PathNode.LineTo(14.273f, 2.006f),
                    PathNode.CurveTo(15.910187f, 2.080223f, 17.44576f, 2.820912f, 18.523f, 4.056f),
                    PathNode.LineTo(18.699f, 4.266f),
                    PathNode.CurveTo(19.602573f, 5.403048f, 20.06305f, 6.829244f, 19.995f, 8.28f),
                    PathNode.LineTo(19.977f, 8.524f),
                    PathNode.LineTo(20.083f, 8.584f),
                    PathNode.CurveTo(21.17452f, 9.2496f, 21.882126f, 10.396855f, 21.987f, 11.671f),
                    PathNode.LineTo(21.998f, 11.875f),
                    PathNode.CurveTo(22.036259f, 13.085025f, 21.524443f, 14.247274f, 20.606f, 15.036f),
                    PathNode.LineTo(20.521f, 15.105f),
                    PathNode.LineTo(20.604f, 15.265f),
                    PathNode.CurveTo(21.031672f, 16.152508f, 21.116776f, 17.166628f, 20.843f, 18.113f),
                    PathNode.LineTo(20.778f, 18.317f),
                    PathNode.CurveTo(20.35258f, 19.53918f, 19.362165f, 20.480034f, 18.119772f, 20.842209f),
                    PathNode.CurveTo(16.877378f, 21.204384f, 15.536533f, 20.943125f, 14.521f, 20.141f),
                    PathNode.LineTo(14.406f, 20.045f),
                    PathNode.LineTo(14.314f, 20.145f),
                    PathNode.CurveTo(13.248085f, 21.228617f, 11.810622f, 21.86729f, 10.292f, 21.932f),
                    PathNode.LineTo(10.035f, 21.938f),
                    PathNode.CurveTo(8.079435f, 21.93847f, 6.246337f, 20.985893f, 5.122757f, 19.38533f),
                    PathNode.CurveTo(3.999177f, 17.784765f, 3.726108f, 15.737063f, 4.391f, 13.898f),
                    PathNode.LineTo(4.425f, 13.809f),
                    PathNode.LineTo(4.27f, 13.689f),
                    PathNode.CurveTo(2.101262f, 11.947848f, 1.413349f, 8.944542f, 2.608f, 6.433f),
                    PathNode.LineTo(2.713f, 6.222f),
                    PathNode.CurveTo(4.085713f, 3.604146f, 7.160546f, 2.37608f, 9.959f, 3.328f),
                    PathNode.LineTo(10.147f, 3.396f),
                    PathNode.LineTo(10.22f, 3.336f),
                    PathNode.CurveTo(11.215782f, 2.528245f, 12.44414f, 2.060733f, 13.725f, 2.002f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 9.0f),
                    PathNode.CurveTo(10.401546f, 9.000132f, 9.083922f, 10.253545f, 9.004f, 11.85f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 13.656855f, 10.343145f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(13.656855f, 15.0f, 15.0f, 13.656855f, 15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 10.343145f, 13.656855f, 9.0f, 12.0f, 9.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _eggFried!!
    }

private var _eggFried: ImageVector? = null
