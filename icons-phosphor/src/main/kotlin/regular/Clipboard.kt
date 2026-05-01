package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Clipboard: ImageVector
    get() {
        if (_clipboard != null) return _clipboard!!
        _clipboard = phosphorRegularIcon(
            name = "Clipboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 32.0f),
                    PathNode.LineTo(163.74f, 32.0f),
                    PathNode.CurveTo(154.6485f, 21.82095f, 141.64801f, 16.001448f, 128.0f, 16.001448f),
                    PathNode.CurveTo(114.35198f, 16.001448f, 101.351494f, 21.82095f, 92.26f, 32.0f),
                    PathNode.LineTo(56.0f, 32.0f),
                    PathNode.CurveTo(47.163445f, 32.0f, 40.0f, 39.163445f, 40.0f, 48.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(216.0f, 39.163445f, 208.83656f, 32.0f, 200.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.CurveTo(145.67311f, 32.0f, 160.0f, 46.32689f, 160.0f, 64.0f),
                    PathNode.LineTo(96.0f, 64.0f),
                    PathNode.CurveTo(96.0f, 46.32689f, 110.32689f, 32.0f, 128.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 216.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.LineTo(82.75f, 48.0f),
                    PathNode.CurveTo(80.93019f, 53.138157f, 80.00018f, 58.549095f, 80.0f, 64.0f),
                    PathNode.LineTo(80.0f, 72.0f),
                    PathNode.CurveTo(80.0f, 76.41828f, 83.58172f, 80.0f, 88.0f, 80.0f),
                    PathNode.LineTo(168.0f, 80.0f),
                    PathNode.CurveTo(172.41827f, 80.0f, 176.0f, 76.41828f, 176.0f, 72.0f),
                    PathNode.LineTo(176.0f, 64.0f),
                    PathNode.CurveTo(175.99982f, 58.549095f, 175.06981f, 53.138157f, 173.25f, 48.0f),
                    PathNode.LineTo(200.0f, 48.0f),
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
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null
