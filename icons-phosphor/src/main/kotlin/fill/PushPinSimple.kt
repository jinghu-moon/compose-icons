package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PushPinSimple: ImageVector
    get() {
        if (_pushPinSimple != null) return _pushPinSimple!!
        _pushPinSimple = phosphorFillIcon(
            name = "PushPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 176.0f),
                    PathNode.CurveTo(224.0f, 180.41827f, 220.41827f, 184.0f, 216.0f, 184.0f),
                    PathNode.LineTo(136.0f, 184.0f),
                    PathNode.LineTo(136.0f, 240.0f),
                    PathNode.CurveTo(136.0f, 244.41827f, 132.41827f, 248.0f, 128.0f, 248.0f),
                    PathNode.CurveTo(123.58172f, 248.0f, 120.0f, 244.41827f, 120.0f, 240.0f),
                    PathNode.LineTo(120.0f, 184.0f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.CurveTo(35.581722f, 184.0f, 32.0f, 180.41827f, 32.0f, 176.0f),
                    PathNode.CurveTo(32.0f, 171.58173f, 35.581722f, 168.0f, 40.0f, 168.0f),
                    PathNode.LineTo(49.29f, 168.0f),
                    PathNode.LineTo(70.46f, 48.0f),
                    PathNode.LineTo(64.0f, 48.0f),
                    PathNode.CurveTo(59.581722f, 48.0f, 56.0f, 44.418278f, 56.0f, 40.0f),
                    PathNode.CurveTo(56.0f, 35.581722f, 59.581722f, 32.0f, 64.0f, 32.0f),
                    PathNode.LineTo(192.0f, 32.0f),
                    PathNode.CurveTo(196.41827f, 32.0f, 200.0f, 35.581722f, 200.0f, 40.0f),
                    PathNode.CurveTo(200.0f, 44.418278f, 196.41827f, 48.0f, 192.0f, 48.0f),
                    PathNode.LineTo(185.54f, 48.0f),
                    PathNode.LineTo(206.71f, 168.0f),
                    PathNode.LineTo(216.0f, 168.0f),
                    PathNode.CurveTo(220.41827f, 168.0f, 224.0f, 171.58173f, 224.0f, 176.0f),
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
        return _pushPinSimple!!
    }

private var _pushPinSimple: ImageVector? = null
