package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PushPinSimpleSlash: ImageVector
    get() {
        if (_pushPinSimpleSlash != null) return _pushPinSimpleSlash!!
        _pushPinSimpleSlash = phosphorLightIcon(
            name = "PushPinSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(85.25f, 40.0f),
                    PathNode.CurveTo(85.25f, 36.68629f, 87.936295f, 34.0f, 91.25f, 34.0f),
                    PathNode.LineTo(192.0f, 34.0f),
                    PathNode.CurveTo(195.3137f, 34.0f, 198.0f, 36.68629f, 198.0f, 40.0f),
                    PathNode.CurveTo(198.0f, 43.31371f, 195.3137f, 46.0f, 192.0f, 46.0f),
                    PathNode.LineTo(183.15f, 46.0f),
                    PathNode.LineTo(202.32f, 154.64f),
                    PathNode.CurveTo(202.61093f, 156.21358f, 202.26122f, 157.83818f, 201.34857f, 159.15268f),
                    PathNode.CurveTo(200.43594f, 160.46716f, 199.03603f, 161.36263f, 197.46f, 161.64f),
                    PathNode.CurveTo(197.11409f, 161.70746f, 196.76242f, 161.74095f, 196.41f, 161.74f),
                    PathNode.CurveTo(193.48827f, 161.73216f, 190.99695f, 159.62088f, 190.51f, 156.74f),
                    PathNode.LineTo(171.0f, 46.0f),
                    PathNode.LineTo(91.25f, 46.0f),
                    PathNode.CurveTo(87.936295f, 46.0f, 85.25f, 43.31371f, 85.25f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 220.44f),
                    PathNode.CurveTo(210.82278f, 221.5122f, 209.26765f, 222.07251f, 207.6771f, 221.99748f),
                    PathNode.CurveTo(206.08655f, 221.92245f, 204.59106f, 221.21826f, 203.52f, 220.04f),
                    PathNode.LineTo(169.0f, 182.0f),
                    PathNode.LineTo(134.0f, 182.0f),
                    PathNode.LineTo(134.0f, 240.0f),
                    PathNode.CurveTo(134.0f, 243.3137f, 131.3137f, 246.0f, 128.0f, 246.0f),
                    PathNode.CurveTo(124.686295f, 246.0f, 122.0f, 243.3137f, 122.0f, 240.0f),
                    PathNode.LineTo(122.0f, 182.0f),
                    PathNode.LineTo(40.0f, 182.0f),
                    PathNode.CurveTo(36.68629f, 182.0f, 34.0f, 179.3137f, 34.0f, 176.0f),
                    PathNode.CurveTo(34.0f, 172.6863f, 36.68629f, 170.0f, 40.0f, 170.0f),
                    PathNode.LineTo(51.0f, 170.0f),
                    PathNode.LineTo(68.38f, 71.33f),
                    PathNode.LineTo(43.56f, 44.0f),
                    PathNode.CurveTo(41.69497f, 41.515873f, 42.03432f, 38.019005f, 44.342197f, 35.93984f),
                    PathNode.CurveTo(46.65007f, 33.860672f, 50.163273f, 33.886772f, 52.44f, 36.0f),
                    PathNode.LineTo(212.44f, 212.0f),
                    PathNode.CurveTo(214.63576f, 214.45688f, 214.43933f, 218.22476f, 212.0f, 220.44f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 170.0f),
                    PathNode.LineTo(78.58f, 82.56f),
                    PathNode.LineTo(63.15f, 170.0f),
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
        return _pushPinSimpleSlash!!
    }

private var _pushPinSimpleSlash: ImageVector? = null
