package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) return _arrowsCounterClockwise!!
        _arrowsCounterClockwise = phosphorBoldIcon(
            name = "ArrowsCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 108.0f),
                    PathNode.LineTo(40.0f, 108.0f),
                    PathNode.CurveTo(33.37258f, 108.0f, 28.0f, 102.62742f, 28.0f, 96.0f),
                    PathNode.LineTo(28.0f, 48.0f),
                    PathNode.CurveTo(28.0f, 41.37258f, 33.37258f, 36.0f, 40.0f, 36.0f),
                    PathNode.CurveTo(46.62742f, 36.0f, 52.0f, 41.37258f, 52.0f, 48.0f),
                    PathNode.LineTo(52.0f, 67.0f),
                    PathNode.LineTo(59.8f, 59.2f),
                    PathNode.CurveTo(78.39721f, 40.5282f, 103.64685f, 30.003914f, 130.0f, 29.94f),
                    PathNode.LineTo(130.56f, 29.94f),
                    PathNode.CurveTo(156.6869f, 29.876642f, 181.78784f, 40.104546f, 200.43f, 58.41f),
                    PathNode.CurveTo(205.16861f, 63.04367f, 205.25366f, 70.641396f, 200.62f, 75.38f),
                    PathNode.CurveTo(195.98634f, 80.11861f, 188.3886f, 80.20367f, 183.65f, 75.57f),
                    PathNode.CurveTo(153.87263f, 46.4883f, 106.24233f, 46.76916f, 76.81f, 76.2f),
                    PathNode.LineTo(69.0f, 84.0f),
                    PathNode.LineTo(88.0f, 84.0f),
                    PathNode.CurveTo(94.62742f, 84.0f, 100.0f, 89.37258f, 100.0f, 96.0f),
                    PathNode.CurveTo(100.0f, 102.62742f, 94.62742f, 108.0f, 88.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 148.0f),
                    PathNode.LineTo(168.0f, 148.0f),
                    PathNode.CurveTo(161.37259f, 148.0f, 156.0f, 153.37259f, 156.0f, 160.0f),
                    PathNode.CurveTo(156.0f, 166.62741f, 161.37259f, 172.0f, 168.0f, 172.0f),
                    PathNode.LineTo(187.0f, 172.0f),
                    PathNode.LineTo(179.2f, 179.8f),
                    PathNode.CurveTo(165.0782f, 193.99182f, 145.90071f, 201.99803f, 125.88f, 202.06f),
                    PathNode.LineTo(125.45f, 202.06f),
                    PathNode.CurveTo(105.597626f, 202.11131f, 86.52409f, 194.34035f, 72.36f, 180.43f),
                    PathNode.CurveTo(67.6214f, 175.79633f, 60.02367f, 175.8814f, 55.39f, 180.62f),
                    PathNode.CurveTo(50.756332f, 185.3586f, 50.841396f, 192.95633f, 55.58f, 197.59f),
                    PathNode.CurveTo(74.22215f, 215.89546f, 99.32309f, 226.12337f, 125.45f, 226.06f),
                    PathNode.LineTo(126.0f, 226.06f),
                    PathNode.CurveTo(152.34358f, 225.97754f, 177.5775f, 215.44302f, 196.16f, 196.77f),
                    PathNode.LineTo(204.0f, 189.0f),
                    PathNode.LineTo(204.0f, 208.0f),
                    PathNode.CurveTo(204.0f, 214.62741f, 209.37259f, 220.0f, 216.0f, 220.0f),
                    PathNode.CurveTo(222.62741f, 220.0f, 228.0f, 214.62741f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 160.0f),
                    PathNode.CurveTo(228.0f, 153.37259f, 222.62741f, 148.0f, 216.0f, 148.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
