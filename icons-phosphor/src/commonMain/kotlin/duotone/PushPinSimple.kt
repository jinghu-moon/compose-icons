package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PushPinSimple: ImageVector
    get() {
        if (_pushPinSimple != null) return _pushPinSimple!!
        _pushPinSimple = phosphorDuotoneIcon(
            name = "PushPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 176.0f),
                    PathNode.LineTo(56.0f, 176.0f),
                    PathNode.LineTo(80.0f, 40.0f),
                    PathNode.LineTo(176.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 168.0f),
                    PathNode.LineTo(206.71f, 168.0f),
                    PathNode.LineTo(185.54f, 48.0f),
                    PathNode.LineTo(192.0f, 48.0f),
                    PathNode.CurveTo(196.41827f, 48.0f, 200.0f, 44.418278f, 200.0f, 40.0f),
                    PathNode.CurveTo(200.0f, 35.581722f, 196.41827f, 32.0f, 192.0f, 32.0f),
                    PathNode.LineTo(64.0f, 32.0f),
                    PathNode.CurveTo(59.581722f, 32.0f, 56.0f, 35.581722f, 56.0f, 40.0f),
                    PathNode.CurveTo(56.0f, 44.418278f, 59.581722f, 48.0f, 64.0f, 48.0f),
                    PathNode.LineTo(70.46f, 48.0f),
                    PathNode.LineTo(49.29f, 168.0f),
                    PathNode.LineTo(40.0f, 168.0f),
                    PathNode.CurveTo(35.581722f, 168.0f, 32.0f, 171.58173f, 32.0f, 176.0f),
                    PathNode.CurveTo(32.0f, 180.41827f, 35.581722f, 184.0f, 40.0f, 184.0f),
                    PathNode.LineTo(120.0f, 184.0f),
                    PathNode.LineTo(120.0f, 240.0f),
                    PathNode.CurveTo(120.0f, 244.41827f, 123.58172f, 248.0f, 128.0f, 248.0f),
                    PathNode.CurveTo(132.41827f, 248.0f, 136.0f, 244.41827f, 136.0f, 240.0f),
                    PathNode.LineTo(136.0f, 184.0f),
                    PathNode.LineTo(216.0f, 184.0f),
                    PathNode.CurveTo(220.41827f, 184.0f, 224.0f, 180.41827f, 224.0f, 176.0f),
                    PathNode.CurveTo(224.0f, 171.58173f, 220.41827f, 168.0f, 216.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(86.71f, 48.0f),
                    PathNode.LineTo(169.29f, 48.0f),
                    PathNode.LineTo(190.46f, 168.0f),
                    PathNode.LineTo(65.54f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pushPinSimple!!
    }

private var _pushPinSimple: ImageVector? = null
