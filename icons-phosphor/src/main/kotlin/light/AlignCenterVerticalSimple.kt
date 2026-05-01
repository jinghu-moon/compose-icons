package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignCenterVerticalSimple: ImageVector
    get() {
        if (_alignCenterVerticalSimple != null) return _alignCenterVerticalSimple!!
        _alignCenterVerticalSimple = phosphorLightIcon(
            name = "AlignCenterVerticalSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 122.0f),
                    PathNode.LineTo(174.0f, 122.0f),
                    PathNode.LineTo(174.0f, 48.0f),
                    PathNode.CurveTo(174.0f, 40.268013f, 167.73198f, 34.0f, 160.0f, 34.0f),
                    PathNode.LineTo(96.0f, 34.0f),
                    PathNode.CurveTo(88.26801f, 34.0f, 82.0f, 40.268013f, 82.0f, 48.0f),
                    PathNode.LineTo(82.0f, 122.0f),
                    PathNode.LineTo(48.0f, 122.0f),
                    PathNode.CurveTo(44.68629f, 122.0f, 42.0f, 124.686295f, 42.0f, 128.0f),
                    PathNode.CurveTo(42.0f, 131.3137f, 44.68629f, 134.0f, 48.0f, 134.0f),
                    PathNode.LineTo(82.0f, 134.0f),
                    PathNode.LineTo(82.0f, 208.0f),
                    PathNode.CurveTo(82.0f, 215.73198f, 88.26801f, 222.0f, 96.0f, 222.0f),
                    PathNode.LineTo(160.0f, 222.0f),
                    PathNode.CurveTo(167.73198f, 222.0f, 174.0f, 215.73198f, 174.0f, 208.0f),
                    PathNode.LineTo(174.0f, 134.0f),
                    PathNode.LineTo(208.0f, 134.0f),
                    PathNode.CurveTo(211.3137f, 134.0f, 214.0f, 131.3137f, 214.0f, 128.0f),
                    PathNode.CurveTo(214.0f, 124.686295f, 211.3137f, 122.0f, 208.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(162.0f, 208.0f),
                    PathNode.CurveTo(162.0f, 209.10457f, 161.10457f, 210.0f, 160.0f, 210.0f),
                    PathNode.LineTo(96.0f, 210.0f),
                    PathNode.CurveTo(94.89543f, 210.0f, 94.0f, 209.10457f, 94.0f, 208.0f),
                    PathNode.LineTo(94.0f, 48.0f),
                    PathNode.CurveTo(94.0f, 46.89543f, 94.89543f, 46.0f, 96.0f, 46.0f),
                    PathNode.LineTo(160.0f, 46.0f),
                    PathNode.CurveTo(161.10457f, 46.0f, 162.0f, 46.89543f, 162.0f, 48.0f),
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
        return _alignCenterVerticalSimple!!
    }

private var _alignCenterVerticalSimple: ImageVector? = null
