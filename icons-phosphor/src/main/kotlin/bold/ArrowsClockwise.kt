package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsClockwise: ImageVector
    get() {
        if (_arrowsClockwise != null) return _arrowsClockwise!!
        _arrowsClockwise = phosphorBoldIcon(
            name = "ArrowsClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 48.0f),
                    PathNode.LineTo(228.0f, 96.0f),
                    PathNode.CurveTo(228.0f, 102.62742f, 222.62741f, 108.0f, 216.0f, 108.0f),
                    PathNode.LineTo(168.0f, 108.0f),
                    PathNode.CurveTo(161.37259f, 108.0f, 156.0f, 102.62742f, 156.0f, 96.0f),
                    PathNode.CurveTo(156.0f, 89.37258f, 161.37259f, 84.0f, 168.0f, 84.0f),
                    PathNode.LineTo(187.0f, 84.0f),
                    PathNode.LineTo(179.2f, 76.2f),
                    PathNode.CurveTo(165.0782f, 62.008183f, 145.90071f, 54.001976f, 125.88f, 53.94f),
                    PathNode.LineTo(125.45f, 53.94f),
                    PathNode.CurveTo(105.60801f, 53.89658f, 86.546684f, 61.666958f, 72.39f, 75.57f),
                    PathNode.CurveTo(67.6514f, 80.20367f, 60.05367f, 80.11861f, 55.42f, 75.38f),
                    PathNode.CurveTo(50.78633f, 70.641396f, 50.871395f, 63.04367f, 55.61f, 58.41f),
                    PathNode.CurveTo(74.25215f, 40.104546f, 99.35309f, 29.876642f, 125.48f, 29.94f),
                    PathNode.LineTo(126.0f, 29.94f),
                    PathNode.CurveTo(152.35745f, 30.011864f, 177.60771f, 40.54719f, 196.2f, 59.23f),
                    PathNode.LineTo(204.0f, 67.0f),
                    PathNode.LineTo(204.0f, 48.0f),
                    PathNode.CurveTo(204.0f, 41.37258f, 209.37259f, 36.0f, 216.0f, 36.0f),
                    PathNode.CurveTo(222.62741f, 36.0f, 228.0f, 41.37258f, 228.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(183.61f, 180.43f),
                    PathNode.CurveTo(169.4459f, 194.34035f, 150.37238f, 202.11131f, 130.52f, 202.06f),
                    PathNode.LineTo(130.09f, 202.06f),
                    PathNode.CurveTo(110.06929f, 201.99803f, 90.89179f, 193.99182f, 76.77f, 179.8f),
                    PathNode.LineTo(69.0f, 172.0f),
                    PathNode.LineTo(88.0f, 172.0f),
                    PathNode.CurveTo(94.62742f, 172.0f, 100.0f, 166.62741f, 100.0f, 160.0f),
                    PathNode.CurveTo(100.0f, 153.37259f, 94.62742f, 148.0f, 88.0f, 148.0f),
                    PathNode.LineTo(40.0f, 148.0f),
                    PathNode.CurveTo(33.37258f, 148.0f, 28.0f, 153.37259f, 28.0f, 160.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 214.62741f, 33.37258f, 220.0f, 40.0f, 220.0f),
                    PathNode.CurveTo(46.62742f, 220.0f, 52.0f, 214.62741f, 52.0f, 208.0f),
                    PathNode.LineTo(52.0f, 189.0f),
                    PathNode.LineTo(59.8f, 196.8f),
                    PathNode.CurveTo(78.39721f, 215.4718f, 103.64685f, 225.99608f, 130.0f, 226.06f),
                    PathNode.LineTo(130.56f, 226.06f),
                    PathNode.CurveTo(156.6869f, 226.12337f, 181.78784f, 215.89546f, 200.43f, 197.59f),
                    PathNode.CurveTo(205.16861f, 192.95633f, 205.25366f, 185.3586f, 200.62f, 180.62f),
                    PathNode.CurveTo(195.98634f, 175.8814f, 188.3886f, 175.79633f, 183.65f, 180.43f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowsClockwise!!
    }

private var _arrowsClockwise: ImageVector? = null
