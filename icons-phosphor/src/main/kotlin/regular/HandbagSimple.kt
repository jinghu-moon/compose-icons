package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HandbagSimple: ImageVector
    get() {
        if (_handbagSimple != null) return _handbagSimple!!
        _handbagSimple = phosphorRegularIcon(
            name = "HandbagSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(239.89f, 198.12f),
                    PathNode.LineTo(225.63f, 78.12f),
                    PathNode.CurveTo(224.67236f, 70.02467f, 217.78157f, 63.94355f, 209.63f, 64.0f),
                    PathNode.LineTo(176.0f, 64.0f),
                    PathNode.CurveTo(176.0f, 37.490334f, 154.50967f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(101.49033f, 16.0f, 80.0f, 37.490334f, 80.0f, 64.0f),
                    PathNode.LineTo(46.33f, 64.0f),
                    PathNode.CurveTo(38.178425f, 63.94355f, 31.287638f, 70.02467f, 30.33f, 78.12f),
                    PathNode.LineTo(16.07f, 198.12f),
                    PathNode.CurveTo(15.541449f, 202.65f, 16.971191f, 207.19025f, 20.0f, 210.6f),
                    PathNode.CurveTo(23.050528f, 214.02397f, 27.41425f, 215.98764f, 32.0f, 216.0f),
                    PathNode.LineTo(223.92f, 216.0f),
                    PathNode.CurveTo(228.53365f, 216.01045f, 232.93092f, 214.04478f, 236.0f, 210.6f),
                    PathNode.CurveTo(239.01442f, 207.18361f, 240.42938f, 202.64412f, 239.89f, 198.12f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.CurveTo(145.67311f, 32.0f, 160.0f, 46.32689f, 160.0f, 64.0f),
                    PathNode.LineTo(96.0f, 64.0f),
                    PathNode.CurveTo(96.0f, 46.32689f, 110.32689f, 32.0f, 128.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 200.0f),
                    PathNode.LineTo(46.33f, 80.0f),
                    PathNode.LineTo(209.75f, 80.0f),
                    PathNode.LineTo(223.92f, 200.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _handbagSimple!!
    }

private var _handbagSimple: ImageVector? = null
