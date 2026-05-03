package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Crosshair: ImageVector
    get() {
        if (_crosshair != null) return _crosshair!!
        _crosshair = phosphorBoldIcon(
            name = "Crosshair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 116.0f),
                    PathNode.LineTo(227.28f, 116.0f),
                    PathNode.CurveTo(221.68285f, 70.31511f, 185.68489f, 34.317158f, 140.0f, 28.72f),
                    PathNode.LineTo(140.0f, 24.0f),
                    PathNode.CurveTo(140.0f, 17.372583f, 134.62741f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(121.37258f, 12.0f, 116.0f, 17.372583f, 116.0f, 24.0f),
                    PathNode.LineTo(116.0f, 28.72f),
                    PathNode.CurveTo(70.31511f, 34.317158f, 34.317158f, 70.31511f, 28.72f, 116.0f),
                    PathNode.LineTo(24.0f, 116.0f),
                    PathNode.CurveTo(17.372583f, 116.0f, 12.0f, 121.37258f, 12.0f, 128.0f),
                    PathNode.CurveTo(12.0f, 134.62741f, 17.372583f, 140.0f, 24.0f, 140.0f),
                    PathNode.LineTo(28.72f, 140.0f),
                    PathNode.CurveTo(34.317158f, 185.68489f, 70.31511f, 221.68285f, 116.0f, 227.28f),
                    PathNode.LineTo(116.0f, 232.0f),
                    PathNode.CurveTo(116.0f, 238.62741f, 121.37258f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(134.62741f, 244.0f, 140.0f, 238.62741f, 140.0f, 232.0f),
                    PathNode.LineTo(140.0f, 227.28f),
                    PathNode.CurveTo(185.68489f, 221.68285f, 221.68285f, 185.68489f, 227.28f, 140.0f),
                    PathNode.LineTo(232.0f, 140.0f),
                    PathNode.CurveTo(238.62741f, 140.0f, 244.0f, 134.62741f, 244.0f, 128.0f),
                    PathNode.CurveTo(244.0f, 121.37258f, 238.62741f, 116.0f, 232.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 203.0f),
                    PathNode.LineTo(140.0f, 200.0f),
                    PathNode.CurveTo(140.0f, 193.37259f, 134.62741f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(121.37258f, 188.0f, 116.0f, 193.37259f, 116.0f, 200.0f),
                    PathNode.LineTo(116.0f, 203.0f),
                    PathNode.CurveTo(83.624344f, 197.75801f, 58.24199f, 172.37567f, 53.0f, 140.0f),
                    PathNode.LineTo(56.0f, 140.0f),
                    PathNode.CurveTo(62.62742f, 140.0f, 68.0f, 134.62741f, 68.0f, 128.0f),
                    PathNode.CurveTo(68.0f, 121.37258f, 62.62742f, 116.0f, 56.0f, 116.0f),
                    PathNode.LineTo(53.0f, 116.0f),
                    PathNode.CurveTo(58.24199f, 83.624344f, 83.624344f, 58.24199f, 116.0f, 53.0f),
                    PathNode.LineTo(116.0f, 56.0f),
                    PathNode.CurveTo(116.0f, 62.62742f, 121.37258f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(134.62741f, 68.0f, 140.0f, 62.62742f, 140.0f, 56.0f),
                    PathNode.LineTo(140.0f, 53.0f),
                    PathNode.CurveTo(172.37567f, 58.24199f, 197.75801f, 83.624344f, 203.0f, 116.0f),
                    PathNode.LineTo(200.0f, 116.0f),
                    PathNode.CurveTo(193.37259f, 116.0f, 188.0f, 121.37258f, 188.0f, 128.0f),
                    PathNode.CurveTo(188.0f, 134.62741f, 193.37259f, 140.0f, 200.0f, 140.0f),
                    PathNode.LineTo(203.0f, 140.0f),
                    PathNode.CurveTo(197.75801f, 172.37567f, 172.37567f, 197.75801f, 140.0f, 203.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 84.0f),
                    PathNode.CurveTo(103.69947f, 84.0f, 84.0f, 103.69947f, 84.0f, 128.0f),
                    PathNode.CurveTo(84.0f, 152.30052f, 103.69947f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(152.30052f, 172.0f, 172.0f, 152.30052f, 172.0f, 128.0f),
                    PathNode.CurveTo(171.97244f, 103.71089f, 152.28911f, 84.02756f, 128.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 148.0f),
                    PathNode.CurveTo(116.95431f, 148.0f, 108.0f, 139.0457f, 108.0f, 128.0f),
                    PathNode.CurveTo(108.0f, 116.95431f, 116.95431f, 108.0f, 128.0f, 108.0f),
                    PathNode.CurveTo(139.0457f, 108.0f, 148.0f, 116.95431f, 148.0f, 128.0f),
                    PathNode.CurveTo(148.0f, 139.0457f, 139.0457f, 148.0f, 128.0f, 148.0f),
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
        return _crosshair!!
    }

private var _crosshair: ImageVector? = null
