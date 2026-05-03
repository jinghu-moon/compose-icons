package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BookOpenUser: ImageVector
    get() {
        if (_bookOpenUser != null) return _bookOpenUser!!
        _bookOpenUser = phosphorLightIcon(
            name = "BookOpenUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 74.0f),
                    PathNode.LineTo(160.0f, 74.0f),
                    PathNode.CurveTo(147.03828f, 74.009575f, 134.97545f, 80.62529f, 128.0f, 91.55f),
                    PathNode.CurveTo(121.02455f, 80.62529f, 108.961716f, 74.009575f, 96.0f, 74.0f),
                    PathNode.LineTo(24.0f, 74.0f),
                    PathNode.CurveTo(20.68629f, 74.0f, 18.0f, 76.686295f, 18.0f, 80.0f),
                    PathNode.LineTo(18.0f, 200.0f),
                    PathNode.CurveTo(18.0f, 203.3137f, 20.68629f, 206.0f, 24.0f, 206.0f),
                    PathNode.LineTo(96.0f, 206.0f),
                    PathNode.CurveTo(110.359406f, 206.0f, 122.0f, 217.6406f, 122.0f, 232.0f),
                    PathNode.CurveTo(122.0f, 235.3137f, 124.686295f, 238.0f, 128.0f, 238.0f),
                    PathNode.CurveTo(131.3137f, 238.0f, 134.0f, 235.3137f, 134.0f, 232.0f),
                    PathNode.CurveTo(134.0f, 217.6406f, 145.6406f, 206.0f, 160.0f, 206.0f),
                    PathNode.LineTo(232.0f, 206.0f),
                    PathNode.CurveTo(235.3137f, 206.0f, 238.0f, 203.3137f, 238.0f, 200.0f),
                    PathNode.LineTo(238.0f, 80.0f),
                    PathNode.CurveTo(238.0f, 76.686295f, 235.3137f, 74.0f, 232.0f, 74.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 194.0f),
                    PathNode.LineTo(30.0f, 194.0f),
                    PathNode.LineTo(30.0f, 86.0f),
                    PathNode.LineTo(96.0f, 86.0f),
                    PathNode.CurveTo(110.359406f, 86.0f, 122.0f, 97.640594f, 122.0f, 112.0f),
                    PathNode.LineTo(122.0f, 204.31f),
                    PathNode.CurveTo(114.967f, 197.68065f, 105.66495f, 193.99203f, 96.0f, 194.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 194.0f),
                    PathNode.LineTo(160.0f, 194.0f),
                    PathNode.CurveTo(150.33173f, 193.99438f, 141.02821f, 197.69075f, 134.0f, 204.33f),
                    PathNode.LineTo(134.0f, 112.0f),
                    PathNode.CurveTo(134.0f, 97.640594f, 145.6406f, 86.0f, 160.0f, 86.0f),
                    PathNode.LineTo(226.0f, 86.0f),
                    PathNode.Close,
                    PathNode.MoveTo(91.2f, 44.4f),
                    PathNode.CurveTo(99.8873f, 32.816933f, 113.52116f, 26.0f, 128.0f, 26.0f),
                    PathNode.CurveTo(142.47884f, 26.0f, 156.1127f, 32.816933f, 164.8f, 44.4f),
                    PathNode.CurveTo(166.78822f, 47.05097f, 166.25096f, 50.811775f, 163.6f, 52.8f),
                    PathNode.CurveTo(160.94904f, 54.788227f, 157.18823f, 54.250965f, 155.2f, 51.6f),
                    PathNode.CurveTo(148.77895f, 43.0386f, 138.70174f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(117.29825f, 38.0f, 107.22105f, 43.0386f, 100.8f, 51.6f),
                    PathNode.CurveTo(98.811775f, 54.250965f, 95.050964f, 54.788227f, 92.4f, 52.8f),
                    PathNode.CurveTo(89.74903f, 50.811775f, 89.21178f, 47.05097f, 91.2f, 44.4f),
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
        return _bookOpenUser!!
    }

private var _bookOpenUser: ImageVector? = null
