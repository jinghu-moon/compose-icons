package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Towel: ImageVector
    get() {
        if (_towel != null) return _towel!!
        _towel = phosphorFillIcon(
            name = "Towel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(224.0f, 152.0f),
                    PathNode.CurveTo(224.00487f, 154.21684f, 223.08966f, 156.3363f, 221.47269f, 157.85281f),
                    PathNode.CurveTo(219.85571f, 159.36931f, 217.68199f, 160.14687f, 215.47f, 160.0f),
                    PathNode.CurveTo(211.20233f, 159.63339f, 207.94234f, 156.033f, 208.0f, 151.75f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.CurveTo(208.00525f, 45.779446f, 207.08733f, 43.656605f, 205.46587f, 42.139454f),
                    PathNode.CurveTo(203.8444f, 40.62229f, 201.66531f, 39.847332f, 199.45f, 40.0f),
                    PathNode.CurveTo(195.18326f, 40.386612f, 191.93544f, 43.996258f, 192.0f, 48.28f),
                    PathNode.LineTo(192.0f, 180.0f),
                    PathNode.CurveTo(192.0f, 182.20914f, 190.20914f, 184.0f, 188.0f, 184.0f),
                    PathNode.LineTo(52.0f, 184.0f),
                    PathNode.CurveTo(49.79086f, 184.0f, 48.0f, 182.20914f, 48.0f, 180.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.CurveTo(48.0f, 34.745167f, 58.745167f, 24.0f, 72.0f, 24.0f),
                    PathNode.LineTo(200.0f, 24.0f),
                    PathNode.CurveTo(213.25484f, 24.0f, 224.0f, 34.745167f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 200.0f),
                    PathNode.LineTo(52.0f, 200.0f),
                    PathNode.CurveTo(49.79086f, 200.0f, 48.0f, 201.79086f, 48.0f, 204.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(48.0f, 224.83656f, 55.163445f, 232.0f, 64.0f, 232.0f),
                    PathNode.LineTo(176.0f, 232.0f),
                    PathNode.CurveTo(184.83656f, 232.0f, 192.0f, 224.83656f, 192.0f, 216.0f),
                    PathNode.LineTo(192.0f, 204.0f),
                    PathNode.CurveTo(192.0f, 201.79086f, 190.20914f, 200.0f, 188.0f, 200.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _towel!!
    }

private var _towel: ImageVector? = null
