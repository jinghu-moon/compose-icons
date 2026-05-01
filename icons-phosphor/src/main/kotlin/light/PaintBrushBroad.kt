package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaintBrushBroad: ImageVector
    get() {
        if (_paintBrushBroad != null) return _paintBrushBroad!!
        _paintBrushBroad = phosphorLightIcon(
            name = "PaintBrushBroad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 26.0f),
                    PathNode.LineTo(72.0f, 26.0f),
                    PathNode.CurveTo(51.01318f, 26.0f, 34.0f, 43.01318f, 34.0f, 64.0f),
                    PathNode.LineTo(34.0f, 136.0f),
                    PathNode.CurveTo(34.0f, 148.15027f, 43.849735f, 158.0f, 56.0f, 158.0f),
                    PathNode.LineTo(104.0f, 158.0f),
                    PathNode.CurveTo(104.5728f, 157.9962f, 105.119736f, 158.23817f, 105.50218f, 158.66461f),
                    PathNode.CurveTo(105.88463f, 159.09105f, 106.06589f, 159.661f, 106.0f, 160.23f),
                    PathNode.LineTo(98.08f, 207.0f),
                    PathNode.CurveTo(98.02853f, 207.33089f, 98.001785f, 207.66515f, 98.0f, 208.0f),
                    PathNode.CurveTo(98.0f, 224.56854f, 111.43146f, 238.0f, 128.0f, 238.0f),
                    PathNode.CurveTo(144.56854f, 238.0f, 158.0f, 224.56854f, 158.0f, 208.0f),
                    PathNode.CurveTo(157.99821f, 207.66515f, 157.97147f, 207.33089f, 157.92f, 207.0f),
                    PathNode.LineTo(150.0f, 160.23f),
                    PathNode.CurveTo(149.93411f, 159.661f, 150.11537f, 159.09105f, 150.49782f, 158.66461f),
                    PathNode.CurveTo(150.88028f, 158.23817f, 151.4272f, 157.9962f, 152.0f, 158.0f),
                    PathNode.LineTo(200.0f, 158.0f),
                    PathNode.CurveTo(212.15027f, 158.0f, 222.0f, 148.15027f, 222.0f, 136.0f),
                    PathNode.LineTo(222.0f, 32.0f),
                    PathNode.CurveTo(222.0f, 28.68629f, 219.3137f, 26.0f, 216.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 38.0f),
                    PathNode.LineTo(178.0f, 38.0f),
                    PathNode.LineTo(178.0f, 80.0f),
                    PathNode.CurveTo(178.0f, 83.313705f, 180.6863f, 86.0f, 184.0f, 86.0f),
                    PathNode.CurveTo(187.3137f, 86.0f, 190.0f, 83.313705f, 190.0f, 80.0f),
                    PathNode.LineTo(190.0f, 38.0f),
                    PathNode.LineTo(210.0f, 38.0f),
                    PathNode.LineTo(210.0f, 106.0f),
                    PathNode.LineTo(46.0f, 106.0f),
                    PathNode.LineTo(46.0f, 64.0f),
                    PathNode.CurveTo(46.0f, 49.6406f, 57.6406f, 38.0f, 72.0f, 38.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 146.0f),
                    PathNode.LineTo(152.0f, 146.0f),
                    PathNode.CurveTo(147.93735f, 145.99896f, 144.07462f, 147.76276f, 141.41458f, 150.83351f),
                    PathNode.CurveTo(138.75455f, 153.90422f, 137.55962f, 157.97902f, 138.14f, 162.0f),
                    PathNode.LineTo(138.14f, 162.15f),
                    PathNode.LineTo(146.0f, 208.47f),
                    PathNode.CurveTo(146.0f, 218.41113f, 137.94113f, 226.47f, 128.0f, 226.47f),
                    PathNode.CurveTo(118.05888f, 226.47f, 110.0f, 218.41113f, 110.0f, 208.47f),
                    PathNode.LineTo(117.82f, 162.13f),
                    PathNode.LineTo(117.82f, 161.98f),
                    PathNode.CurveTo(118.39303f, 157.96907f, 117.200325f, 153.9066f, 114.54999f, 150.84203f),
                    PathNode.CurveTo(111.89965f, 147.77745f, 108.051636f, 146.01135f, 104.0f, 146.0f),
                    PathNode.LineTo(56.0f, 146.0f),
                    PathNode.CurveTo(50.477154f, 146.0f, 46.0f, 141.52284f, 46.0f, 136.0f),
                    PathNode.LineTo(46.0f, 118.0f),
                    PathNode.LineTo(210.0f, 118.0f),
                    PathNode.LineTo(210.0f, 136.0f),
                    PathNode.CurveTo(210.0f, 141.52284f, 205.52284f, 146.0f, 200.0f, 146.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _paintBrushBroad!!
    }

private var _paintBrushBroad: ImageVector? = null
