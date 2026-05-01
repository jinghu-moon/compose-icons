package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SneakerMove: ImageVector
    get() {
        if (_sneakerMove != null) return _sneakerMove!!
        _sneakerMove = phosphorBoldIcon(
            name = "SneakerMove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.94f, 163.06f),
                    PathNode.LineTo(204.32f, 148.75f),
                    PathNode.CurveTo(189.3765f, 141.335f, 179.94566f, 126.07195f, 180.0f, 109.39f),
                    PathNode.LineTo(180.0f, 80.0f),
                    PathNode.CurveTo(180.0f, 73.37258f, 174.62741f, 68.0f, 168.0f, 68.0f),
                    PathNode.CurveTo(143.71089f, 67.97244f, 124.02756f, 48.28911f, 124.0f, 24.0f),
                    PathNode.CurveTo(123.99913f, 19.443867f, 121.41814f, 15.281226f, 117.33751f, 13.254692f),
                    PathNode.CurveTo(113.25689f, 11.228158f, 108.38059f, 11.687336f, 104.75f, 14.44f),
                    PathNode.LineTo(27.75f, 72.85f),
                    PathNode.LineTo(27.45f, 73.08f),
                    PathNode.CurveTo(23.042788f, 76.6465f, 20.356348f, 81.91593f, 20.058865f, 87.57763f),
                    PathNode.CurveTo(19.761381f, 93.23934f, 21.880812f, 98.76128f, 25.89f, 102.77f),
                    PathNode.LineTo(139.57f, 216.49f),
                    PathNode.CurveTo(141.82237f, 218.73987f, 144.87645f, 220.0025f, 148.06f, 220.0f),
                    PathNode.LineTo(224.0f, 220.0f),
                    PathNode.CurveTo(235.0457f, 220.0f, 244.0f, 211.0457f, 244.0f, 200.0f),
                    PathNode.LineTo(244.0f, 180.94f),
                    PathNode.CurveTo(244.02426f, 173.35866f, 239.7344f, 166.42352f, 232.94f, 163.06f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 196.0f),
                    PathNode.LineTo(153.0f, 196.0f),
                    PathNode.LineTo(46.08f, 89.05f),
                    PathNode.LineTo(58.94f, 79.29f),
                    PathNode.LineTo(100.14f, 120.49f),
                    PathNode.CurveTo(104.83442f, 125.18442f, 112.44558f, 125.18442f, 117.14f, 120.49f),
                    PathNode.CurveTo(121.83442f, 115.79558f, 121.83442f, 108.18442f, 117.14f, 103.49f),
                    PathNode.LineTo(78.25f, 64.65f),
                    PathNode.LineTo(103.49f, 45.51f),
                    PathNode.CurveTo(111.40504f, 69.09195f, 131.52484f, 86.49897f, 156.0f, 90.94f),
                    PathNode.LineTo(156.0f, 109.39f),
                    PathNode.CurveTo(155.91086f, 135.17162f, 170.49004f, 158.76048f, 193.59f, 170.21f),
                    PathNode.LineTo(220.0f, 183.42f),
                    PathNode.Close,
                    PathNode.MoveTo(55.49f, 184.0f),
                    PathNode.LineTo(32.0f, 184.0f),
                    PathNode.CurveTo(25.372583f, 184.0f, 20.0f, 178.62741f, 20.0f, 172.0f),
                    PathNode.CurveTo(20.0f, 165.37259f, 25.372583f, 160.0f, 32.0f, 160.0f),
                    PathNode.LineTo(55.49f, 160.0f),
                    PathNode.CurveTo(62.117416f, 160.0f, 67.49f, 165.37259f, 67.49f, 172.0f),
                    PathNode.CurveTo(67.49f, 178.62741f, 62.117416f, 184.0f, 55.49f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(103.49f, 208.0f),
                    PathNode.CurveTo(103.49f, 214.62741f, 98.11742f, 220.0f, 91.49f, 220.0f),
                    PathNode.LineTo(48.0f, 220.0f),
                    PathNode.CurveTo(41.37258f, 220.0f, 36.0f, 214.62741f, 36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 201.37259f, 41.37258f, 196.0f, 48.0f, 196.0f),
                    PathNode.LineTo(91.49f, 196.0f),
                    PathNode.CurveTo(98.11742f, 196.0f, 103.49f, 201.37259f, 103.49f, 208.0f),
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
        return _sneakerMove!!
    }

private var _sneakerMove: ImageVector? = null
