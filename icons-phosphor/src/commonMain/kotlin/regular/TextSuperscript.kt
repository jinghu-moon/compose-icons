package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TextSuperscript: ImageVector
    get() {
        if (_textSuperscript != null) return _textSuperscript!!
        _textSuperscript = phosphorRegularIcon(
            name = "TextSuperscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 144.0f),
                    PathNode.CurveTo(248.0f, 148.41827f, 244.41827f, 152.0f, 240.0f, 152.0f),
                    PathNode.LineTo(192.0f, 152.0f),
                    PathNode.CurveTo(188.96982f, 152.0f, 186.19972f, 150.28798f, 184.84459f, 147.57771f),
                    PathNode.CurveTo(183.48944f, 144.86742f, 183.78189f, 141.62415f, 185.6f, 139.2f),
                    PathNode.LineTo(228.77f, 81.65f),
                    PathNode.CurveTo(232.54596f, 76.61791f, 233.02252f, 69.84004f, 229.98785f, 64.329094f),
                    PathNode.CurveTo(226.95319f, 58.818146f, 220.9706f, 55.597084f, 214.6993f, 56.097637f),
                    PathNode.CurveTo(208.428f, 56.598194f, 203.03209f, 60.727455f, 200.91f, 66.65f),
                    PathNode.CurveTo(199.43816f, 70.816986f, 194.86699f, 73.00184f, 190.7f, 71.53f),
                    PathNode.CurveTo(186.533f, 70.05816f, 184.34816f, 65.48699f, 185.82f, 61.32f),
                    PathNode.CurveTo(190.02966f, 49.445328f, 200.81526f, 41.145863f, 213.3721f, 40.118774f),
                    PathNode.CurveTo(225.92894f, 39.091682f, 237.91985f, 45.528145f, 244.00323f, 56.56089f),
                    PathNode.CurveTo(250.08662f, 67.59364f, 249.13019f, 81.16918f, 241.56f, 91.24f),
                    PathNode.LineTo(208.0f, 136.0f),
                    PathNode.LineTo(240.0f, 136.0f),
                    PathNode.CurveTo(244.41827f, 136.0f, 248.0f, 139.58173f, 248.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(149.24f, 74.0f),
                    PathNode.CurveTo(147.63713f, 72.60812f, 145.54677f, 71.91037f, 143.42921f, 72.06042f),
                    PathNode.CurveTo(141.31168f, 72.210464f, 139.34058f, 73.196f, 137.95f, 74.8f),
                    PathNode.LineTo(92.0f, 127.79f),
                    PathNode.LineTo(46.05f, 74.79f),
                    PathNode.CurveTo(43.075382f, 71.86274f, 38.350285f, 71.71393f, 35.197365f, 74.44821f),
                    PathNode.CurveTo(32.04444f, 77.18248f, 31.523125f, 81.88109f, 34.0f, 85.24f),
                    PathNode.LineTo(81.41f, 140.0f),
                    PathNode.LineTo(34.0f, 194.76f),
                    PathNode.CurveTo(31.106028f, 198.10132f, 31.468678f, 203.15602f, 34.81f, 206.05f),
                    PathNode.CurveTo(38.15132f, 208.94397f, 43.206028f, 208.58133f, 46.1f, 205.24f),
                    PathNode.LineTo(92.1f, 152.24f),
                    PathNode.LineTo(138.05f, 205.24f),
                    PathNode.CurveTo(140.94397f, 208.58133f, 145.99867f, 208.94397f, 149.34f, 206.05f),
                    PathNode.CurveTo(152.68134f, 203.15602f, 153.04396f, 198.10132f, 150.15f, 194.76f),
                    PathNode.LineTo(102.59f, 140.0f),
                    PathNode.LineTo(150.05f, 85.24f),
                    PathNode.CurveTo(152.91241f, 81.90661f, 152.55078f, 76.88853f, 149.24f, 74.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textSuperscript!!
    }

private var _textSuperscript: ImageVector? = null
