package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.StackSimple: ImageVector
    get() {
        if (_stackSimple != null) return _stackSimple!!
        _stackSimple = phosphorThinIcon(
            name = "StackSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 107.47f),
                    PathNode.LineTo(126.0f, 171.47f),
                    PathNode.CurveTo(127.2376f, 172.18452f, 128.76239f, 172.18452f, 130.0f, 171.47f),
                    PathNode.LineTo(242.0f, 107.47f),
                    PathNode.CurveTo(243.24338f, 106.75703f, 244.01025f, 105.43329f, 244.01025f, 104.0f),
                    PathNode.CurveTo(244.01025f, 102.56671f, 243.24338f, 101.24297f, 242.0f, 100.53f),
                    PathNode.LineTo(130.0f, 36.53f),
                    PathNode.CurveTo(128.76239f, 35.815468f, 127.2376f, 35.815468f, 126.0f, 36.53f),
                    PathNode.LineTo(14.0f, 100.53f),
                    PathNode.CurveTo(12.756622f, 101.24297f, 11.989749f, 102.56671f, 11.989749f, 104.0f),
                    PathNode.CurveTo(11.989749f, 105.43329f, 12.756622f, 106.75703f, 14.0f, 107.47f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 44.61f),
                    PathNode.LineTo(231.94f, 104.0f),
                    PathNode.LineTo(128.0f, 163.39f),
                    PathNode.LineTo(24.06f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(243.47f, 142.0f),
                    PathNode.CurveTo(244.56065f, 143.9168f, 243.89415f, 146.3547f, 241.98f, 147.45f),
                    PathNode.LineTo(129.98f, 211.45f),
                    PathNode.CurveTo(128.7424f, 212.16454f, 127.217606f, 212.16454f, 125.98f, 211.45f),
                    PathNode.LineTo(13.98f, 147.45f),
                    PathNode.CurveTo(12.063572f, 146.34543f, 11.405431f, 143.89642f, 12.51f, 141.98f),
                    PathNode.CurveTo(13.61457f, 140.06357f, 16.063572f, 139.40543f, 17.98f, 140.51f),
                    PathNode.LineTo(127.98f, 203.37f),
                    PathNode.LineTo(237.98f, 140.51f),
                    PathNode.CurveTo(238.9042f, 139.97343f, 240.00468f, 139.82901f, 241.03604f, 140.10892f),
                    PathNode.CurveTo(242.06741f, 140.38882f, 242.94388f, 141.06981f, 243.47f, 142.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _stackSimple!!
    }

private var _stackSimple: ImageVector? = null
