package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaintRoller: ImageVector
    get() {
        if (_paintRoller != null) return _paintRoller!!
        _paintRoller = phosphorBoldIcon(
            name = "PaintRoller",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 84.0f),
                    PathNode.LineTo(212.0f, 84.0f),
                    PathNode.LineTo(212.0f, 64.0f),
                    PathNode.CurveTo(212.0f, 52.954304f, 203.0457f, 44.0f, 192.0f, 44.0f),
                    PathNode.LineTo(52.0f, 44.0f),
                    PathNode.CurveTo(40.954304f, 44.0f, 32.0f, 52.954304f, 32.0f, 64.0f),
                    PathNode.LineTo(32.0f, 84.0f),
                    PathNode.LineTo(16.0f, 84.0f),
                    PathNode.CurveTo(9.372583f, 84.0f, 4.0f, 89.37258f, 4.0f, 96.0f),
                    PathNode.CurveTo(4.0f, 102.62742f, 9.372583f, 108.0f, 16.0f, 108.0f),
                    PathNode.LineTo(32.0f, 108.0f),
                    PathNode.LineTo(32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 139.0457f, 40.954304f, 148.0f, 52.0f, 148.0f),
                    PathNode.LineTo(192.0f, 148.0f),
                    PathNode.CurveTo(203.0457f, 148.0f, 212.0f, 139.0457f, 212.0f, 128.0f),
                    PathNode.LineTo(212.0f, 108.0f),
                    PathNode.LineTo(228.0f, 108.0f),
                    PathNode.LineTo(228.0f, 155.0f),
                    PathNode.LineTo(130.5f, 182.8f),
                    PathNode.CurveTo(121.944954f, 185.27818f, 116.04287f, 193.09335f, 116.0f, 202.0f),
                    PathNode.LineTo(116.0f, 232.0f),
                    PathNode.CurveTo(116.0f, 238.62741f, 121.37258f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(134.62741f, 244.0f, 140.0f, 238.62741f, 140.0f, 232.0f),
                    PathNode.LineTo(140.0f, 205.05f),
                    PathNode.LineTo(237.5f, 177.2f),
                    PathNode.CurveTo(246.05504f, 174.72182f, 251.95712f, 166.90665f, 252.0f, 158.0f),
                    PathNode.LineTo(252.0f, 104.0f),
                    PathNode.CurveTo(252.0f, 92.95431f, 243.0457f, 84.0f, 232.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 124.0f),
                    PathNode.LineTo(56.0f, 124.0f),
                    PathNode.LineTo(56.0f, 68.0f),
                    PathNode.LineTo(188.0f, 68.0f),
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
        return _paintRoller!!
    }

private var _paintRoller: ImageVector? = null
