package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Couch: ImageVector
    get() {
        if (_couch != null) return _couch!!
        _couch = phosphorFillIcon(
            name = "Couch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 100.0f),
                    PathNode.LineTo(16.0f, 72.0f),
                    PathNode.CurveTo(16.0f, 63.163445f, 23.163445f, 56.0f, 32.0f, 56.0f),
                    PathNode.LineTo(116.0f, 56.0f),
                    PathNode.CurveTo(118.20914f, 56.0f, 120.0f, 57.79086f, 120.0f, 60.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.LineTo(64.0f, 136.0f),
                    PathNode.CurveTo(64.0f, 118.32689f, 49.67311f, 104.0f, 32.0f, 104.0f),
                    PathNode.LineTo(20.0f, 104.0f),
                    PathNode.CurveTo(17.790861f, 104.0f, 16.0f, 102.20914f, 16.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 104.0f),
                    PathNode.LineTo(236.0f, 104.0f),
                    PathNode.CurveTo(238.20914f, 104.0f, 240.0f, 102.20914f, 240.0f, 100.0f),
                    PathNode.LineTo(240.0f, 72.0f),
                    PathNode.CurveTo(240.0f, 63.163445f, 232.83656f, 56.0f, 224.0f, 56.0f),
                    PathNode.LineTo(140.0f, 56.0f),
                    PathNode.CurveTo(137.79086f, 56.0f, 136.0f, 57.79086f, 136.0f, 60.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.LineTo(192.0f, 136.0f),
                    PathNode.CurveTo(192.0f, 118.32689f, 206.32689f, 104.0f, 224.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 120.0f),
                    PathNode.LineTo(224.0f, 120.0f),
                    PathNode.CurveTo(215.16344f, 120.0f, 208.0f, 127.163445f, 208.0f, 136.0f),
                    PathNode.LineTo(208.0f, 144.0f),
                    PathNode.CurveTo(208.0f, 148.41827f, 204.41827f, 152.0f, 200.0f, 152.0f),
                    PathNode.LineTo(56.0f, 152.0f),
                    PathNode.CurveTo(51.581722f, 152.0f, 48.0f, 148.41827f, 48.0f, 144.0f),
                    PathNode.LineTo(48.0f, 136.0f),
                    PathNode.CurveTo(48.0f, 127.163445f, 40.836555f, 120.0f, 32.0f, 120.0f),
                    PathNode.LineTo(24.0f, 120.0f),
                    PathNode.CurveTo(15.163444f, 120.0f, 8.0f, 127.163445f, 8.0f, 136.0f),
                    PathNode.LineTo(8.0f, 168.0f),
                    PathNode.CurveTo(8.0f, 176.83656f, 15.163444f, 184.0f, 24.0f, 184.0f),
                    PathNode.LineTo(32.0f, 184.0f),
                    PathNode.LineTo(32.0f, 199.73f),
                    PathNode.CurveTo(31.93666f, 204.0188f, 35.196877f, 207.62817f, 39.47f, 208.0f),
                    PathNode.CurveTo(41.68197f, 208.14687f, 43.855713f, 207.36931f, 45.472687f, 205.85281f),
                    PathNode.CurveTo(47.089657f, 204.3363f, 48.00487f, 202.21684f, 48.0f, 200.0f),
                    PathNode.LineTo(48.0f, 184.0f),
                    PathNode.LineTo(208.0f, 184.0f),
                    PathNode.LineTo(208.0f, 199.73f),
                    PathNode.CurveTo(207.94234f, 204.013f, 211.20233f, 207.61339f, 215.47f, 207.98f),
                    PathNode.CurveTo(217.68199f, 208.12688f, 219.85571f, 207.34932f, 221.47269f, 205.83281f),
                    PathNode.CurveTo(223.08966f, 204.3163f, 224.00487f, 202.19684f, 224.0f, 199.98f),
                    PathNode.LineTo(224.0f, 184.0f),
                    PathNode.LineTo(232.0f, 184.0f),
                    PathNode.CurveTo(240.83656f, 184.0f, 248.0f, 176.83656f, 248.0f, 168.0f),
                    PathNode.LineTo(248.0f, 136.0f),
                    PathNode.CurveTo(248.0f, 127.163445f, 240.83656f, 120.0f, 232.0f, 120.0f),
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
        return _couch!!
    }

private var _couch: ImageVector? = null
