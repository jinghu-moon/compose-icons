package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BluetoothX: ImageVector
    get() {
        if (_bluetoothX != null) return _bluetoothX!!
        _bluetoothX = phosphorFillIcon(
            name = "BluetoothX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 176.0f),
                    PathNode.CurveTo(184.0f, 178.51805f, 182.81445f, 180.88918f, 180.8f, 182.4f),
                    PathNode.LineTo(116.8f, 230.4f),
                    PathNode.CurveTo(115.41523f, 231.43858f, 113.730965f, 232.0f, 112.0f, 232.0f),
                    PathNode.CurveTo(110.55139f, 232.00401f, 109.12957f, 231.60963f, 107.89f, 230.86f),
                    PathNode.CurveTo(105.4204f, 229.3166f, 103.94035f, 226.5918f, 103.99f, 223.68f),
                    PathNode.LineTo(103.99f, 144.0f),
                    PathNode.LineTo(52.76f, 182.4f),
                    PathNode.CurveTo(49.245327f, 185.0348f, 44.263603f, 184.3429f, 41.6f, 180.85f),
                    PathNode.CurveTo(38.985428f, 177.18597f, 39.785877f, 172.10312f, 43.4f, 169.42f),
                    PathNode.LineTo(98.66f, 128.0f),
                    PathNode.LineTo(43.38f, 86.57f),
                    PathNode.CurveTo(39.921375f, 84.044014f, 38.992947f, 79.27984f, 41.25f, 75.64f),
                    PathNode.CurveTo(42.463585f, 73.7885f, 44.390133f, 72.52266f, 46.57123f, 72.14366f),
                    PathNode.CurveTo(48.75233f, 71.76467f, 50.99297f, 72.30642f, 52.76f, 73.64f),
                    PathNode.LineTo(104.0f, 112.0f),
                    PathNode.LineTo(104.0f, 32.24f),
                    PathNode.CurveTo(103.95936f, 29.81215f, 104.99552f, 27.490849f, 106.83f, 25.9f),
                    PathNode.CurveTo(109.681946f, 23.470984f, 113.83757f, 23.346313f, 116.83f, 25.6f),
                    PathNode.LineTo(150.45f, 50.8f),
                    PathNode.CurveTo(151.43842f, 51.565784f, 152.01187f, 52.749706f, 152.0f, 54.0f),
                    PathNode.LineTo(152.0f, 106.0f),
                    PathNode.CurveTo(152.0f, 107.259026f, 151.40723f, 108.44459f, 150.4f, 109.2f),
                    PathNode.LineTo(125.34f, 128.0f),
                    PathNode.LineTo(180.84f, 169.6f),
                    PathNode.CurveTo(182.83939f, 171.11917f, 184.00946f, 173.48895f, 184.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(237.47f, 98.13f),
                    PathNode.LineTo(219.37f, 80.0f),
                    PathNode.LineTo(237.48f, 61.89f),
                    PathNode.CurveTo(240.64627f, 58.82437f, 240.82722f, 53.80572f, 237.89f, 50.52f),
                    PathNode.CurveTo(236.40764f, 48.94118f, 234.34851f, 48.030807f, 232.18312f, 47.996883f),
                    PathNode.CurveTo(230.01773f, 47.962963f, 227.93109f, 48.80839f, 226.4f, 50.34f),
                    PathNode.LineTo(208.05f, 68.69f),
                    PathNode.LineTo(189.93f, 50.58f),
                    PathNode.CurveTo(187.05415f, 47.606647f, 182.41814f, 47.229946f, 179.1f, 49.7f),
                    PathNode.CurveTo(177.28137f, 51.111088f, 176.15869f, 53.23716f, 176.01892f, 55.53477f),
                    PathNode.CurveTo(175.87915f, 57.83239f, 176.73584f, 60.07887f, 178.37f, 61.7f),
                    PathNode.LineTo(196.73f, 80.0f),
                    PathNode.LineTo(178.58f, 98.13f),
                    PathNode.CurveTo(175.51991f, 101.10919f, 175.25888f, 105.93832f, 177.98f, 109.23f),
                    PathNode.CurveTo(179.43277f, 110.91236f, 181.52f, 111.91444f, 183.74132f, 111.99601f),
                    PathNode.CurveTo(185.96265f, 112.077576f, 188.11777f, 111.23128f, 189.69f, 109.66f),
                    PathNode.LineTo(208.05f, 91.31f),
                    PathNode.LineTo(226.4f, 109.66f),
                    PathNode.CurveTo(227.97256f, 111.23458f, 230.12993f, 112.082985f, 232.35379f, 112.00139f),
                    PathNode.CurveTo(234.57767f, 111.9198f, 236.66705f, 110.91558f, 238.12f, 109.23f),
                    PathNode.CurveTo(240.8336f, 105.93417f, 240.5684f, 101.10863f, 237.51f, 98.13f),
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
        return _bluetoothX!!
    }

private var _bluetoothX: ImageVector? = null
