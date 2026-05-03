package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MemberOf: ImageVector
    get() {
        if (_memberOf != null) return _memberOf!!
        _memberOf = phosphorBoldIcon(
            name = "MemberOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 140.0f),
                    PathNode.LineTo(61.08f, 140.0f),
                    PathNode.CurveTo(66.926865f, 172.38332f, 95.09312f, 195.95338f, 128.0f, 196.0f),
                    PathNode.LineTo(200.0f, 196.0f),
                    PathNode.CurveTo(206.62741f, 196.0f, 212.0f, 201.37259f, 212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 214.62741f, 206.62741f, 220.0f, 200.0f, 220.0f),
                    PathNode.LineTo(128.0f, 220.0f),
                    PathNode.CurveTo(77.18981f, 220.0f, 36.0f, 178.8102f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 77.18981f, 77.18981f, 36.0f, 128.0f, 36.0f),
                    PathNode.LineTo(200.0f, 36.0f),
                    PathNode.CurveTo(206.62741f, 36.0f, 212.0f, 41.37258f, 212.0f, 48.0f),
                    PathNode.CurveTo(212.0f, 54.62742f, 206.62741f, 60.0f, 200.0f, 60.0f),
                    PathNode.LineTo(128.0f, 60.0f),
                    PathNode.CurveTo(95.09312f, 60.046597f, 66.926865f, 83.61668f, 61.08f, 116.0f),
                    PathNode.LineTo(200.0f, 116.0f),
                    PathNode.CurveTo(206.62741f, 116.0f, 212.0f, 121.37258f, 212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 134.62741f, 206.62741f, 140.0f, 200.0f, 140.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _memberOf!!
    }

private var _memberOf: ImageVector? = null
