package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ClockCounterClockwise: ImageVector
    get() {
        if (_clockCounterClockwise != null) return _clockCounterClockwise!!
        _clockCounterClockwise = phosphorFillIcon(
            name = "ClockCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.00093f, 166.3238f, 201.20844f, 200.97656f, 166.0179f, 216.15355f),
                    PathNode.CurveTo(130.82738f, 231.33052f, 89.98166f, 224.1237f, 62.11f, 197.82f),
                    PathNode.CurveTo(58.895702f, 194.78246f, 58.752434f, 189.7143f, 61.79f, 186.5f),
                    PathNode.CurveTo(64.82757f, 183.2857f, 69.895706f, 183.14244f, 73.11f, 186.18f),
                    PathNode.CurveTo(105.029015f, 216.29279f, 155.24757f, 215.07292f, 185.66687f, 183.44588f),
                    PathNode.CurveTo(216.08615f, 151.81883f, 215.35078f, 101.59084f, 184.01866f, 70.867874f),
                    PathNode.CurveTo(152.68654f, 40.144905f, 102.45379f, 40.395702f, 71.43f, 71.43f),
                    PathNode.CurveTo(67.9f, 75.0f, 64.58f, 78.51f, 61.35f, 82.0f),
                    PathNode.LineTo(77.66f, 98.34f),
                    PathNode.CurveTo(79.95064f, 100.62809f, 80.63632f, 104.07126f, 79.39698f, 107.062325f),
                    PathNode.CurveTo(78.15764f, 110.05338f, 75.237656f, 112.00255f, 72.0f, 112.0f),
                    PathNode.LineTo(32.0f, 112.0f),
                    PathNode.CurveTo(27.581722f, 112.0f, 24.0f, 108.41828f, 24.0f, 104.0f),
                    PathNode.LineTo(24.0f, 64.0f),
                    PathNode.CurveTo(23.997452f, 60.76235f, 25.94662f, 57.84236f, 28.93768f, 56.60302f),
                    PathNode.CurveTo(31.92874f, 55.363674f, 35.371906f, 56.04936f, 37.66f, 58.34f),
                    PathNode.LineTo(50.0f, 70.7f),
                    PathNode.CurveTo(53.22f, 67.21f, 56.54f, 63.7f, 60.06f, 60.15f),
                    PathNode.CurveTo(87.50622f, 32.657017f, 128.81654f, 24.415323f, 164.71167f, 39.27127f),
                    PathNode.CurveTo(200.6068f, 54.12722f, 224.01035f, 89.15211f, 224.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 72.0f),
                    PathNode.CurveTo(123.58172f, 72.0f, 120.0f, 75.58172f, 120.0f, 80.0f),
                    PathNode.LineTo(120.0f, 128.0f),
                    PathNode.CurveTo(119.99913f, 130.80931f, 121.471886f, 133.41321f, 123.88f, 134.86f),
                    PathNode.LineTo(163.88f, 158.86f),
                    PathNode.CurveTo(167.66867f, 161.1354f, 172.58458f, 159.90868f, 174.86f, 156.12f),
                    PathNode.CurveTo(177.1354f, 152.33133f, 175.90868f, 147.41542f, 172.12f, 145.14f),
                    PathNode.LineTo(136.0f, 123.47f),
                    PathNode.LineTo(136.0f, 80.0f),
                    PathNode.CurveTo(136.0f, 75.58172f, 132.41827f, 72.0f, 128.0f, 72.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _clockCounterClockwise!!
    }

private var _clockCounterClockwise: ImageVector? = null
