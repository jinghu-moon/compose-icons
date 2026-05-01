package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CrownCross: ImageVector
    get() {
        if (_crownCross != null) return _crownCross!!
        _crownCross = phosphorBoldIcon(
            name = "CrownCross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 56.0f),
                    PathNode.CurveTo(164.6f, 56.0f, 150.81f, 60.61f, 140.0f, 68.5f),
                    PathNode.LineTo(140.0f, 44.0f),
                    PathNode.LineTo(152.0f, 44.0f),
                    PathNode.CurveTo(158.62741f, 44.0f, 164.0f, 38.62742f, 164.0f, 32.0f),
                    PathNode.CurveTo(164.0f, 25.372583f, 158.62741f, 20.0f, 152.0f, 20.0f),
                    PathNode.LineTo(140.0f, 20.0f),
                    PathNode.LineTo(140.0f, 12.0f),
                    PathNode.CurveTo(140.0f, 5.372583f, 134.62741f, 0f, 128.0f, 0f),
                    PathNode.CurveTo(121.37258f, 0f, 116.0f, 5.372583f, 116.0f, 12.0f),
                    PathNode.LineTo(116.0f, 20.0f),
                    PathNode.LineTo(104.0f, 20.0f),
                    PathNode.CurveTo(97.37258f, 20.0f, 92.0f, 25.372583f, 92.0f, 32.0f),
                    PathNode.CurveTo(92.0f, 38.62742f, 97.37258f, 44.0f, 104.0f, 44.0f),
                    PathNode.LineTo(116.0f, 44.0f),
                    PathNode.LineTo(116.0f, 68.5f),
                    PathNode.CurveTo(105.19f, 60.61f, 91.4f, 56.0f, 76.0f, 56.0f),
                    PathNode.CurveTo(40.66977f, 56.03858f, 12.038579f, 84.66977f, 12.0f, 120.0f),
                    PathNode.CurveTo(12.0f, 151.66f, 27.53f, 170.6f, 40.55f, 180.91f),
                    PathNode.CurveTo(46.495415f, 185.59851f, 53.035618f, 189.47891f, 60.0f, 192.45f),
                    PathNode.LineTo(60.0f, 208.0f),
                    PathNode.CurveTo(60.0f, 219.0457f, 68.95431f, 228.0f, 80.0f, 228.0f),
                    PathNode.LineTo(176.0f, 228.0f),
                    PathNode.CurveTo(187.0457f, 228.0f, 196.0f, 219.0457f, 196.0f, 208.0f),
                    PathNode.LineTo(196.0f, 192.45f),
                    PathNode.CurveTo(202.96439f, 189.47891f, 209.5046f, 185.59851f, 215.45f, 180.91f),
                    PathNode.CurveTo(228.47f, 170.6f, 244.0f, 151.66f, 244.0f, 120.0f),
                    PathNode.CurveTo(243.96143f, 84.66977f, 215.33023f, 56.03858f, 180.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(181.09f, 172.36f),
                    PathNode.CurveTo(175.74844f, 173.69518f, 172.00084f, 178.4941f, 172.0f, 184.0f),
                    PathNode.LineTo(172.0f, 204.0f),
                    PathNode.LineTo(84.0f, 204.0f),
                    PathNode.LineTo(84.0f, 184.0f),
                    PathNode.CurveTo(83.99917f, 178.4941f, 80.25156f, 173.69518f, 74.91f, 172.36f),
                    PathNode.CurveTo(67.84035f, 170.17847f, 61.240467f, 166.69539f, 55.45f, 162.09f),
                    PathNode.CurveTo(42.54f, 151.87f, 36.0f, 137.71f, 36.0f, 120.0f),
                    PathNode.CurveTo(36.0f, 97.90861f, 53.90861f, 80.0f, 76.0f, 80.0f),
                    PathNode.CurveTo(99.18f, 80.0f, 116.0f, 95.14f, 116.0f, 116.0f),
                    PathNode.LineTo(116.0f, 176.0f),
                    PathNode.CurveTo(116.0f, 182.62741f, 121.37258f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(134.62741f, 188.0f, 140.0f, 182.62741f, 140.0f, 176.0f),
                    PathNode.LineTo(140.0f, 116.0f),
                    PathNode.CurveTo(140.0f, 95.14f, 156.82f, 80.0f, 180.0f, 80.0f),
                    PathNode.CurveTo(202.09138f, 80.0f, 220.0f, 97.90861f, 220.0f, 120.0f),
                    PathNode.CurveTo(220.0f, 161.68f, 182.62f, 172.0f, 181.09f, 172.36f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _crownCross!!
    }

private var _crownCross: ImageVector? = null
