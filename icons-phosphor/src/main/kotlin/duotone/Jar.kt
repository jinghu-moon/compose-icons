package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Jar: ImageVector
    get() {
        if (_jar != null) return _jar!!
        _jar = phosphorDuotoneIcon(
            name = "Jar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 88.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.CurveTo(208.0f, 217.67311f, 193.67311f, 232.0f, 176.0f, 232.0f),
                    PathNode.LineTo(80.0f, 232.0f),
                    PathNode.CurveTo(62.32689f, 232.0f, 48.0f, 217.67311f, 48.0f, 200.0f),
                    PathNode.LineTo(48.0f, 88.0f),
                    PathNode.CurveTo(48.0f, 70.32689f, 62.32689f, 56.0f, 80.0f, 56.0f),
                    PathNode.LineTo(176.0f, 56.0f),
                    PathNode.CurveTo(193.67311f, 56.0f, 208.0f, 70.32689f, 208.0f, 88.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 48.81f),
                    PathNode.LineTo(184.0f, 32.0f),
                    PathNode.CurveTo(184.0f, 23.163445f, 176.83656f, 16.0f, 168.0f, 16.0f),
                    PathNode.LineTo(88.0f, 16.0f),
                    PathNode.CurveTo(79.163445f, 16.0f, 72.0f, 23.163445f, 72.0f, 32.0f),
                    PathNode.LineTo(72.0f, 48.81f),
                    PathNode.CurveTo(53.38767f, 52.628983f, 40.02023f, 68.99992f, 40.0f, 88.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.CurveTo(40.0f, 222.09138f, 57.90861f, 240.0f, 80.0f, 240.0f),
                    PathNode.LineTo(176.0f, 240.0f),
                    PathNode.CurveTo(198.09138f, 240.0f, 216.0f, 222.09138f, 216.0f, 200.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.CurveTo(215.97977f, 68.99992f, 202.61234f, 52.628983f, 184.0f, 48.81f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 48.0f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.LineTo(152.0f, 32.0f),
                    PathNode.LineTo(168.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 48.0f),
                    PathNode.LineTo(120.0f, 32.0f),
                    PathNode.LineTo(136.0f, 32.0f),
                    PathNode.LineTo(136.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 32.0f),
                    PathNode.LineTo(104.0f, 48.0f),
                    PathNode.LineTo(88.0f, 48.0f),
                    PathNode.LineTo(88.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 200.0f),
                    PathNode.CurveTo(200.0f, 213.25484f, 189.25484f, 224.0f, 176.0f, 224.0f),
                    PathNode.LineTo(80.0f, 224.0f),
                    PathNode.CurveTo(66.74516f, 224.0f, 56.0f, 213.25484f, 56.0f, 200.0f),
                    PathNode.LineTo(56.0f, 88.0f),
                    PathNode.CurveTo(56.0f, 74.74516f, 66.74516f, 64.0f, 80.0f, 64.0f),
                    PathNode.LineTo(176.0f, 64.0f),
                    PathNode.CurveTo(189.25484f, 64.0f, 200.0f, 74.74516f, 200.0f, 88.0f),
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
        return _jar!!
    }

private var _jar: ImageVector? = null
