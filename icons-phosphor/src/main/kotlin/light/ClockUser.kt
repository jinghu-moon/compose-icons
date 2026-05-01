package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ClockUser: ImageVector
    get() {
        if (_clockUser != null) return _clockUser!!
        _clockUser = phosphorLightIcon(
            name = "ClockUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(134.0f, 72.0f),
                    PathNode.LineTo(134.0f, 118.29f),
                    PathNode.LineTo(173.32f, 98.63f),
                    PathNode.CurveTo(176.28577f, 97.14988f, 179.88988f, 98.35423f, 181.37f, 101.32f),
                    PathNode.CurveTo(182.85013f, 104.28577f, 181.64577f, 107.88988f, 178.68f, 109.37f),
                    PathNode.LineTo(130.68f, 133.37f),
                    PathNode.CurveTo(128.8198f, 134.29868f, 126.611404f, 134.19814f, 124.84329f, 133.10426f),
                    PathNode.CurveTo(123.07517f, 132.01039f, 121.999374f, 130.07913f, 122.0f, 128.0f),
                    PathNode.LineTo(122.0f, 72.0f),
                    PathNode.CurveTo(122.0f, 68.686295f, 124.686295f, 66.0f, 128.0f, 66.0f),
                    PathNode.CurveTo(131.3137f, 66.0f, 134.0f, 68.686295f, 134.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(78.29437f, 218.0f, 38.0f, 177.70563f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(218.0f, 131.3137f, 220.6863f, 134.0f, 224.0f, 134.0f),
                    PathNode.CurveTo(227.3137f, 134.0f, 230.0f, 131.3137f, 230.0f, 128.0f),
                    PathNode.CurveTo(230.0f, 71.666954f, 184.33304f, 26.0f, 128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(131.3137f, 230.0f, 134.0f, 227.3137f, 134.0f, 224.0f),
                    PathNode.CurveTo(134.0f, 220.6863f, 131.3137f, 218.0f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(229.8f, 222.46f),
                    PathNode.CurveTo(230.65051f, 225.66325f, 228.74326f, 228.94948f, 225.54f, 229.8f),
                    PathNode.CurveTo(222.33675f, 230.65051f, 219.05052f, 228.74326f, 218.2f, 225.54f),
                    PathNode.CurveTo(215.14f, 214.0f, 204.37f, 206.0f, 192.0f, 206.0f),
                    PathNode.CurveTo(179.63f, 206.0f, 168.86f, 214.0f, 165.8f, 225.54f),
                    PathNode.CurveTo(165.10162f, 228.16983f, 162.72098f, 230.00046f, 160.0f, 230.0f),
                    PathNode.CurveTo(159.48036f, 229.99751f, 158.96304f, 229.93034f, 158.46f, 229.8f),
                    PathNode.CurveTo(156.9216f, 229.39178f, 155.60843f, 228.38905f, 154.8095f, 227.01248f),
                    PathNode.CurveTo(154.01054f, 225.6359f, 153.7913f, 223.99826f, 154.2f, 222.46f),
                    PathNode.CurveTo(156.91917f, 212.44334f, 163.60818f, 203.97012f, 172.72f, 199.0f),
                    PathNode.CurveTo(163.05675f, 190.89417f, 159.49551f, 177.60976f, 163.80841f, 165.75725f),
                    PathNode.CurveTo(168.1213f, 153.90472f, 179.38718f, 146.01562f, 192.0f, 146.01562f),
                    PathNode.CurveTo(204.61282f, 146.01562f, 215.8787f, 153.90472f, 220.19159f, 165.75725f),
                    PathNode.CurveTo(224.50449f, 177.60976f, 220.94325f, 190.89417f, 211.28f, 199.0f),
                    PathNode.CurveTo(220.39182f, 203.97012f, 227.08083f, 212.44334f, 229.8f, 222.46f),
                    PathNode.Close,
                    PathNode.MoveTo(174.0f, 176.0f),
                    PathNode.CurveTo(174.0f, 185.94113f, 182.05887f, 194.0f, 192.0f, 194.0f),
                    PathNode.CurveTo(201.94113f, 194.0f, 210.0f, 185.94113f, 210.0f, 176.0f),
                    PathNode.CurveTo(210.0f, 166.05887f, 201.94113f, 158.0f, 192.0f, 158.0f),
                    PathNode.CurveTo(182.05887f, 158.0f, 174.0f, 166.05887f, 174.0f, 176.0f),
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
        return _clockUser!!
    }

private var _clockUser: ImageVector? = null
