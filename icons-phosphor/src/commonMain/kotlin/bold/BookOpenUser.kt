package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BookOpenUser: ImageVector
    get() {
        if (_bookOpenUser != null) return _bookOpenUser!!
        _bookOpenUser = phosphorBoldIcon(
            name = "BookOpenUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 72.0f),
                    PathNode.LineTo(160.0f, 72.0f),
                    PathNode.CurveTo(147.8777f, 71.99611f, 136.29436f, 77.00952f, 128.0f, 85.85f),
                    PathNode.CurveTo(119.70564f, 77.00952f, 108.12231f, 71.99611f, 96.0f, 72.0f),
                    PathNode.LineTo(24.0f, 72.0f),
                    PathNode.CurveTo(17.372583f, 72.0f, 12.0f, 77.37258f, 12.0f, 84.0f),
                    PathNode.LineTo(12.0f, 200.0f),
                    PathNode.CurveTo(12.0f, 206.62741f, 17.372583f, 212.0f, 24.0f, 212.0f),
                    PathNode.LineTo(96.0f, 212.0f),
                    PathNode.CurveTo(107.04569f, 212.0f, 116.0f, 220.9543f, 116.0f, 232.0f),
                    PathNode.CurveTo(116.0f, 238.62741f, 121.37258f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(134.62741f, 244.0f, 140.0f, 238.62741f, 140.0f, 232.0f),
                    PathNode.CurveTo(140.0f, 220.9543f, 148.9543f, 212.0f, 160.0f, 212.0f),
                    PathNode.LineTo(232.0f, 212.0f),
                    PathNode.CurveTo(238.62741f, 212.0f, 244.0f, 206.62741f, 244.0f, 200.0f),
                    PathNode.LineTo(244.0f, 84.0f),
                    PathNode.CurveTo(244.0f, 77.37258f, 238.62741f, 72.0f, 232.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 188.0f),
                    PathNode.LineTo(36.0f, 188.0f),
                    PathNode.LineTo(36.0f, 96.0f),
                    PathNode.LineTo(96.0f, 96.0f),
                    PathNode.CurveTo(107.04569f, 96.0f, 116.0f, 104.95431f, 116.0f, 116.0f),
                    PathNode.LineTo(116.0f, 192.81f),
                    PathNode.CurveTo(109.80983f, 189.64137f, 102.95402f, 187.99255f, 96.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 188.0f),
                    PathNode.LineTo(160.0f, 188.0f),
                    PathNode.CurveTo(153.04396f, 187.99567f, 146.18738f, 189.65154f, 140.0f, 192.83f),
                    PathNode.LineTo(140.0f, 116.0f),
                    PathNode.CurveTo(140.0f, 104.95431f, 148.9543f, 96.0f, 160.0f, 96.0f),
                    PathNode.LineTo(220.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(86.4f, 40.79f),
                    PathNode.CurveTo(96.22043f, 27.696096f, 111.63262f, 19.99f, 128.0f, 19.99f),
                    PathNode.CurveTo(144.36739f, 19.99f, 159.77957f, 27.696096f, 169.6f, 40.79f),
                    PathNode.CurveTo(173.58197f, 46.089172f, 172.51418f, 53.613026f, 167.215f, 57.595f),
                    PathNode.CurveTo(161.91583f, 61.576973f, 154.39197f, 60.50917f, 150.41f, 55.21f),
                    PathNode.CurveTo(145.12276f, 48.151592f, 136.81908f, 43.99666f, 128.0f, 43.99666f),
                    PathNode.CurveTo(119.18093f, 43.99666f, 110.87724f, 48.151592f, 105.59f, 55.21f),
                    PathNode.CurveTo(101.608025f, 60.50917f, 94.084175f, 61.576973f, 88.785f, 57.595f),
                    PathNode.CurveTo(83.485825f, 53.613026f, 82.41803f, 46.089172f, 86.4f, 40.79f),
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
        return _bookOpenUser!!
    }

private var _bookOpenUser: ImageVector? = null
