package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tag: ImageVector
    get() {
        if (_tag != null) return _tag!!
        _tag = phosphorLightIcon(
            name = "Tag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(241.91f, 137.42f),
                    PathNode.LineTo(142.59f, 38.1f),
                    PathNode.CurveTo(139.96803f, 35.468937f, 136.40445f, 33.993107f, 132.69f, 34.0f),
                    PathNode.LineTo(40.0f, 34.0f),
                    PathNode.CurveTo(36.68629f, 34.0f, 34.0f, 36.68629f, 34.0f, 40.0f),
                    PathNode.LineTo(34.0f, 132.69f),
                    PathNode.CurveTo(33.993107f, 136.40445f, 35.468937f, 139.96803f, 38.1f, 142.59f),
                    PathNode.LineTo(137.42f, 241.91f),
                    PathNode.CurveTo(140.04555f, 244.53581f, 143.60672f, 246.01102f, 147.32f, 246.01102f),
                    PathNode.CurveTo(151.03328f, 246.01102f, 154.59445f, 244.53581f, 157.22f, 241.91f),
                    PathNode.LineTo(241.91f, 157.22f),
                    PathNode.CurveTo(244.53581f, 154.59445f, 246.01102f, 151.03328f, 246.01102f, 147.32f),
                    PathNode.CurveTo(246.01102f, 143.60672f, 244.53581f, 140.04555f, 241.91f, 137.42f),
                    PathNode.Close,
                    PathNode.MoveTo(233.42f, 148.73f),
                    PathNode.LineTo(148.73f, 233.42f),
                    PathNode.CurveTo(148.35486f, 233.79555f, 147.84583f, 234.00658f, 147.315f, 234.00658f),
                    PathNode.CurveTo(146.78418f, 234.00658f, 146.27513f, 233.79555f, 145.9f, 233.42f),
                    PathNode.LineTo(46.59f, 134.1f),
                    PathNode.CurveTo(46.214413f, 133.72665f, 46.00223f, 133.21957f, 46.0f, 132.69f),
                    PathNode.LineTo(46.0f, 46.0f),
                    PathNode.LineTo(132.69f, 46.0f),
                    PathNode.CurveTo(133.21957f, 46.00223f, 133.72665f, 46.214413f, 134.1f, 46.59f),
                    PathNode.LineTo(233.42f, 145.9f),
                    PathNode.CurveTo(233.79555f, 146.27513f, 234.00658f, 146.78418f, 234.00658f, 147.315f),
                    PathNode.CurveTo(234.00658f, 147.84583f, 233.79555f, 148.35486f, 233.42f, 148.73f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 84.0f),
                    PathNode.CurveTo(94.0f, 89.52285f, 89.52285f, 94.0f, 84.0f, 94.0f),
                    PathNode.CurveTo(78.47715f, 94.0f, 74.0f, 89.52285f, 74.0f, 84.0f),
                    PathNode.CurveTo(74.0f, 78.47715f, 78.47715f, 74.0f, 84.0f, 74.0f),
                    PathNode.CurveTo(89.52285f, 74.0f, 94.0f, 78.47715f, 94.0f, 84.0f),
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
        return _tag!!
    }

private var _tag: ImageVector? = null
