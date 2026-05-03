package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Medal: ImageVector
    get() {
        if (_medal != null) return _medal!!
        _medal = phosphorThinIcon(
            name = "Medal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 96.0f),
                    PathNode.CurveTo(212.03256f, 56.741432f, 184.86824f, 22.696169f, 146.5823f, 14.011477f),
                    PathNode.CurveTo(108.29638f, 5.326787f, 69.10112f, 24.319197f, 52.191452f, 59.7494f),
                    PathNode.CurveTo(35.281784f, 95.1796f, 45.168148f, 137.59706f, 76.0f, 161.9f),
                    PathNode.LineTo(76.0f, 240.0f),
                    PathNode.CurveTo(76.0f, 242.20914f, 77.79086f, 244.0f, 80.0f, 244.0f),
                    PathNode.CurveTo(80.62097f, 243.99908f, 81.23342f, 243.85538f, 81.79f, 243.58f),
                    PathNode.LineTo(128.0f, 220.47f),
                    PathNode.LineTo(174.22f, 243.58f),
                    PathNode.CurveTo(175.45956f, 244.19595f, 176.92949f, 244.12729f, 178.10622f, 243.39844f),
                    PathNode.CurveTo(179.28297f, 242.66959f, 179.99927f, 241.38417f, 180.0f, 240.0f),
                    PathNode.LineTo(180.0f, 161.9f),
                    PathNode.CurveTo(200.20126f, 145.99736f, 211.995f, 121.709625f, 212.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 233.53f),
                    PathNode.LineTo(129.78f, 212.42f),
                    PathNode.CurveTo(128.65326f, 211.85619f, 127.32674f, 211.85619f, 126.2f, 212.42f),
                    PathNode.LineTo(84.0f, 233.53f),
                    PathNode.LineTo(84.0f, 167.53f),
                    PathNode.CurveTo(110.973206f, 184.17096f, 145.0268f, 184.17096f, 172.0f, 167.53f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 172.0f),
                    PathNode.CurveTo(86.02636f, 172.0f, 52.0f, 137.97365f, 52.0f, 96.0f),
                    PathNode.CurveTo(52.0f, 54.02636f, 86.02636f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(169.97365f, 20.0f, 204.0f, 54.02636f, 204.0f, 96.0f),
                    PathNode.CurveTo(203.9559f, 137.95538f, 169.95538f, 171.9559f, 128.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 44.0f),
                    PathNode.CurveTo(99.2812f, 44.0f, 76.0f, 67.2812f, 76.0f, 96.0f),
                    PathNode.CurveTo(76.0f, 124.7188f, 99.2812f, 148.0f, 128.0f, 148.0f),
                    PathNode.CurveTo(156.71881f, 148.0f, 180.0f, 124.7188f, 180.0f, 96.0f),
                    PathNode.CurveTo(179.96693f, 67.2949f, 156.7051f, 44.033066f, 128.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 140.0f),
                    PathNode.CurveTo(103.69947f, 140.0f, 84.0f, 120.30053f, 84.0f, 96.0f),
                    PathNode.CurveTo(84.0f, 71.69947f, 103.69947f, 52.0f, 128.0f, 52.0f),
                    PathNode.CurveTo(152.30052f, 52.0f, 172.0f, 71.69947f, 172.0f, 96.0f),
                    PathNode.CurveTo(171.97244f, 120.28911f, 152.28911f, 139.97244f, 128.0f, 140.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _medal!!
    }

private var _medal: ImageVector? = null
