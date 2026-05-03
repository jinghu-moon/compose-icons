package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Scribble: ImageVector
    get() {
        if (_scribble != null) return _scribble!!
        _scribble = phosphorLightIcon(
            name = "Scribble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.25f, 188.24f),
                    PathNode.CurveTo(201.13077f, 191.3588f, 199.37837f, 195.58905f, 199.37837f, 200.0f),
                    PathNode.CurveTo(199.37837f, 204.41095f, 201.13077f, 208.6412f, 204.25f, 211.76f),
                    PathNode.CurveTo(205.85522f, 213.25575f, 206.51599f, 215.50844f, 205.97308f, 217.63431f),
                    PathNode.CurveTo(205.43018f, 219.76018f, 203.77017f, 221.42018f, 201.64432f, 221.96309f),
                    PathNode.CurveTo(199.51845f, 222.506f, 197.26576f, 221.84523f, 195.77f, 220.24f),
                    PathNode.CurveTo(190.39867f, 214.8738f, 187.38065f, 207.59259f, 187.38065f, 200.0f),
                    PathNode.CurveTo(187.38065f, 192.40741f, 190.39867f, 185.1262f, 195.77f, 179.76f),
                    PathNode.LineTo(205.14f, 170.38f),
                    PathNode.CurveTo(211.44585f, 163.85414f, 211.3558f, 153.47789f, 204.93764f, 147.06245f),
                    PathNode.CurveTo(198.51947f, 140.64702f, 188.14319f, 140.56137f, 181.62f, 146.87f),
                    PathNode.LineTo(114.87f, 213.62f),
                    PathNode.CurveTo(103.688995f, 224.80101f, 85.561005f, 224.80101f, 74.38f, 213.62f),
                    PathNode.CurveTo(63.198997f, 202.439f, 63.198994f, 184.311f, 74.38f, 173.13f),
                    PathNode.LineTo(173.14f, 74.38f),
                    PathNode.CurveTo(179.44585f, 67.85413f, 179.3558f, 57.477886f, 172.93764f, 51.062447f),
                    PathNode.CurveTo(166.51947f, 44.64701f, 156.14319f, 44.561375f, 149.62f, 50.87f),
                    PathNode.LineTo(82.86f, 117.62f),
                    PathNode.CurveTo(71.67899f, 128.80101f, 53.551006f, 128.80101f, 42.37f, 117.62f),
                    PathNode.CurveTo(31.188995f, 106.438995f, 31.188995f, 88.311005f, 42.37f, 77.13f),
                    PathNode.LineTo(83.75f, 35.76f),
                    PathNode.CurveTo(85.26063f, 34.22282f, 87.479645f, 33.613934f, 89.56324f, 34.164875f),
                    PathNode.CurveTo(91.646835f, 34.71582f, 93.27487f, 36.34194f, 93.82827f, 38.424885f),
                    PathNode.CurveTo(94.381676f, 40.50783f, 93.7754f, 42.72756f, 92.24f, 44.24f),
                    PathNode.LineTo(50.86f, 85.62f),
                    PathNode.CurveTo(44.554146f, 92.14587f, 44.6442f, 102.52212f, 51.062363f, 108.93755f),
                    PathNode.CurveTo(57.48053f, 115.35299f, 67.85682f, 115.43863f, 74.38f, 109.13f),
                    PathNode.LineTo(141.13f, 42.38f),
                    PathNode.CurveTo(152.311f, 31.198996f, 170.439f, 31.198996f, 181.62f, 42.38f),
                    PathNode.CurveTo(192.80101f, 53.561005f, 192.80101f, 71.688995f, 181.62f, 82.87f),
                    PathNode.LineTo(82.86f, 181.62f),
                    PathNode.CurveTo(76.554146f, 188.14586f, 76.644196f, 198.52211f, 83.06236f, 204.93755f),
                    PathNode.CurveTo(89.48053f, 211.35298f, 99.85682f, 211.43863f, 106.38f, 205.13f),
                    PathNode.LineTo(173.14f, 138.38f),
                    PathNode.CurveTo(184.321f, 127.199f, 202.44899f, 127.199f, 213.63f, 138.38f),
                    PathNode.CurveTo(224.811f, 149.561f, 224.811f, 167.689f, 213.63f, 178.87f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _scribble!!
    }

private var _scribble: ImageVector? = null
