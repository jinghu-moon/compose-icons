package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ThreeD: ImageVector
    get() {
        if (_threeD != null) return _threeD!!
        _threeD = phosphorFillIcon(
            name = "ThreeD",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 145.67311f, 169.67311f, 160.0f, 152.0f, 160.0f),
                    PathNode.LineTo(144.0f, 160.0f),
                    PathNode.LineTo(144.0f, 96.0f),
                    PathNode.LineTo(152.0f, 96.0f),
                    PathNode.CurveTo(169.67311f, 96.0f, 184.0f, 110.32689f, 184.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(232.0f, 208.83656f, 224.83656f, 216.0f, 216.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(31.163445f, 216.0f, 24.0f, 208.83656f, 24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 47.163445f, 31.163445f, 40.0f, 40.0f, 40.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(224.83656f, 40.0f, 232.0f, 47.163445f, 232.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 144.0f),
                    PathNode.CurveTo(111.99855f, 131.63155f, 104.869446f, 120.371376f, 93.69f, 115.08f),
                    PathNode.LineTo(110.4f, 92.8f),
                    PathNode.CurveTo(112.21811f, 90.37586f, 112.51055f, 87.13256f, 111.15542f, 84.422295f),
                    PathNode.CurveTo(109.80028f, 81.71202f, 107.030174f, 80.0f, 104.0f, 80.0f),
                    PathNode.LineTo(64.0f, 80.0f),
                    PathNode.CurveTo(59.581722f, 80.0f, 56.0f, 83.58172f, 56.0f, 88.0f),
                    PathNode.CurveTo(56.0f, 92.41828f, 59.581722f, 96.0f, 64.0f, 96.0f),
                    PathNode.LineTo(88.0f, 96.0f),
                    PathNode.LineTo(73.6f, 115.2f),
                    PathNode.CurveTo(71.78189f, 117.62414f, 71.48945f, 120.86744f, 72.84458f, 123.577705f),
                    PathNode.CurveTo(74.19972f, 126.28798f, 76.969826f, 128.0f, 80.0f, 128.0f),
                    PathNode.CurveTo(87.13092f, 127.999176f, 93.401665f, 132.71748f, 95.37623f, 139.56958f),
                    PathNode.CurveTo(97.350784f, 146.42166f, 94.5525f, 153.7534f, 88.514656f, 157.54741f),
                    PathNode.CurveTo(82.476814f, 161.34142f, 74.65699f, 160.68181f, 69.34f, 155.93f),
                    PathNode.CurveTo(66.048386f, 152.9808f, 60.9892f, 153.25838f, 58.04f, 156.55f),
                    PathNode.CurveTo(55.090797f, 159.84161f, 55.36838f, 164.9008f, 58.66f, 167.85f),
                    PathNode.CurveTo(68.06529f, 176.26709f, 81.53963f, 178.36932f, 93.06195f, 173.21733f),
                    PathNode.CurveTo(104.584274f, 168.06534f, 112.0018f, 156.62169f, 112.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 128.0f),
                    PathNode.CurveTo(199.97244f, 101.501755f, 178.49825f, 80.02756f, 152.0f, 80.0f),
                    PathNode.LineTo(136.0f, 80.0f),
                    PathNode.CurveTo(131.58173f, 80.0f, 128.0f, 83.58172f, 128.0f, 88.0f),
                    PathNode.LineTo(128.0f, 168.0f),
                    PathNode.CurveTo(128.0f, 172.41827f, 131.58173f, 176.0f, 136.0f, 176.0f),
                    PathNode.LineTo(152.0f, 176.0f),
                    PathNode.CurveTo(178.49825f, 175.97244f, 199.97244f, 154.49825f, 200.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _threeD!!
    }

private var _threeD: ImageVector? = null
