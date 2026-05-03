package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Record: ImageVector
    get() {
        if (_record != null) return _record!!
        _record = phosphorThinIcon(
            name = "Record",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(77.18981f, 220.0f, 36.0f, 178.8102f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 77.18981f, 77.18981f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(178.8102f, 36.0f, 220.0f, 77.18981f, 220.0f, 128.0f),
                    PathNode.CurveTo(219.94489f, 178.78735f, 178.78735f, 219.94489f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 60.0f),
                    PathNode.CurveTo(90.44463f, 60.0f, 60.0f, 90.44463f, 60.0f, 128.0f),
                    PathNode.CurveTo(60.0f, 165.55536f, 90.44463f, 196.0f, 128.0f, 196.0f),
                    PathNode.CurveTo(165.55536f, 196.0f, 196.0f, 165.55536f, 196.0f, 128.0f),
                    PathNode.CurveTo(195.96141f, 90.46063f, 165.53935f, 60.038586f, 128.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 188.0f),
                    PathNode.CurveTo(94.862915f, 188.0f, 68.0f, 161.13708f, 68.0f, 128.0f),
                    PathNode.CurveTo(68.0f, 94.862915f, 94.862915f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(161.13708f, 68.0f, 188.0f, 94.862915f, 188.0f, 128.0f),
                    PathNode.CurveTo(187.96143f, 161.1211f, 161.1211f, 187.96143f, 128.0f, 188.0f),
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
        return _record!!
    }

private var _record: ImageVector? = null
