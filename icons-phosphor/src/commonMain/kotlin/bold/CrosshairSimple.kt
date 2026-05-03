package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CrosshairSimple: ImageVector
    get() {
        if (_crosshairSimple != null) return _crosshairSimple!!
        _crosshairSimple = phosphorBoldIcon(
            name = "CrosshairSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 211.13f),
                    PathNode.LineTo(140.0f, 184.0f),
                    PathNode.CurveTo(140.0f, 177.37259f, 134.62741f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(121.37258f, 172.0f, 116.0f, 177.37259f, 116.0f, 184.0f),
                    PathNode.LineTo(116.0f, 211.13f),
                    PathNode.CurveTo(79.17291f, 205.75105f, 50.248943f, 176.82709f, 44.87f, 140.0f),
                    PathNode.LineTo(72.0f, 140.0f),
                    PathNode.CurveTo(78.62742f, 140.0f, 84.0f, 134.62741f, 84.0f, 128.0f),
                    PathNode.CurveTo(84.0f, 121.37258f, 78.62742f, 116.0f, 72.0f, 116.0f),
                    PathNode.LineTo(44.87f, 116.0f),
                    PathNode.CurveTo(50.248943f, 79.17291f, 79.17291f, 50.248943f, 116.0f, 44.87f),
                    PathNode.LineTo(116.0f, 72.0f),
                    PathNode.CurveTo(116.0f, 78.62742f, 121.37258f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(134.62741f, 84.0f, 140.0f, 78.62742f, 140.0f, 72.0f),
                    PathNode.LineTo(140.0f, 44.87f),
                    PathNode.CurveTo(176.82709f, 50.248943f, 205.75105f, 79.17291f, 211.13f, 116.0f),
                    PathNode.LineTo(184.0f, 116.0f),
                    PathNode.CurveTo(177.37259f, 116.0f, 172.0f, 121.37258f, 172.0f, 128.0f),
                    PathNode.CurveTo(172.0f, 134.62741f, 177.37259f, 140.0f, 184.0f, 140.0f),
                    PathNode.LineTo(211.13f, 140.0f),
                    PathNode.CurveTo(205.75105f, 176.82709f, 176.82709f, 205.75105f, 140.0f, 211.13f),
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
        return _crosshairSimple!!
    }

private var _crosshairSimple: ImageVector? = null
