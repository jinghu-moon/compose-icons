package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GlobeStand: ImageVector
    get() {
        if (_globeStand != null) return _globeStand!!
        _globeStand = phosphorThinIcon(
            name = "GlobeStand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 180.0f),
                    PathNode.CurveTo(177.97365f, 180.0f, 212.0f, 145.97365f, 212.0f, 104.0f),
                    PathNode.CurveTo(212.0f, 62.02636f, 177.97365f, 28.0f, 136.0f, 28.0f),
                    PathNode.CurveTo(94.02636f, 28.0f, 60.0f, 62.02636f, 60.0f, 104.0f),
                    PathNode.CurveTo(60.044098f, 145.95538f, 94.04464f, 179.9559f, 136.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 36.0f),
                    PathNode.CurveTo(173.55536f, 36.0f, 204.0f, 66.44463f, 204.0f, 104.0f),
                    PathNode.CurveTo(204.0f, 141.55536f, 173.55536f, 172.0f, 136.0f, 172.0f),
                    PathNode.CurveTo(98.44463f, 172.0f, 68.0f, 141.55536f, 68.0f, 104.0f),
                    PathNode.CurveTo(68.03858f, 66.46063f, 98.46063f, 36.038586f, 136.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.89f, 176.28f),
                    PathNode.CurveTo(212.41487f, 177.87419f, 212.36119f, 180.402f, 210.77f, 181.93f),
                    PathNode.CurveTo(191.69363f, 200.32553f, 166.48509f, 211.01164f, 140.0f, 211.93f),
                    PathNode.LineTo(140.0f, 236.0f),
                    PathNode.LineTo(168.0f, 236.0f),
                    PathNode.CurveTo(170.20914f, 236.0f, 172.0f, 237.79086f, 172.0f, 240.0f),
                    PathNode.CurveTo(172.0f, 242.20914f, 170.20914f, 244.0f, 168.0f, 244.0f),
                    PathNode.LineTo(104.0f, 244.0f),
                    PathNode.CurveTo(101.79086f, 244.0f, 100.0f, 242.20914f, 100.0f, 240.0f),
                    PathNode.CurveTo(100.0f, 237.79086f, 101.79086f, 236.0f, 104.0f, 236.0f),
                    PathNode.LineTo(132.0f, 236.0f),
                    PathNode.LineTo(132.0f, 211.92f),
                    PathNode.CurveTo(89.48112f, 210.34491f, 51.84928f, 183.95227f, 35.886665f, 144.51204f),
                    PathNode.CurveTo(19.924047f, 105.071815f, 28.605707f, 59.93474f, 58.06f, 29.23f),
                    PathNode.CurveTo(59.043694f, 28.173025f, 60.520676f, 27.728237f, 61.924458f, 28.066235f),
                    PathNode.CurveTo(63.32824f, 28.40423f, 64.4409f, 29.472544f, 64.83569f, 30.861423f),
                    PathNode.CurveTo(65.230484f, 32.250305f, 64.84611f, 33.74415f, 63.83f, 34.77f),
                    PathNode.CurveTo(26.061865f, 74.02816f, 26.665155f, 136.29404f, 65.18687f, 174.81303f),
                    PathNode.CurveTo(103.70859f, 213.33203f, 165.97452f, 213.93091f, 205.23f, 176.16f),
                    PathNode.CurveTo(205.99608f, 175.42458f, 207.02316f, 175.02397f, 208.08488f, 175.04648f),
                    PathNode.CurveTo(209.14659f, 175.06898f, 210.15578f, 175.51277f, 210.89f, 176.28f),
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
        return _globeStand!!
    }

private var _globeStand: ImageVector? = null
