package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Target: ImageVector
    get() {
        if (_target != null) return _target!!
        _target = phosphorBoldIcon(
            name = "Target",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.26f, 90.4f),
                    PathNode.CurveTo(246.98497f, 138.0089f, 229.13368f, 191.53487f, 186.37978f, 218.97362f),
                    PathNode.CurveTo(143.62585f, 246.41237f, 87.528725f, 240.34529f, 51.63f, 204.4f),
                    PathNode.CurveTo(10.990463f, 163.89432f, 9.119009f, 98.68094f, 47.368763f, 55.911343f),
                    PathNode.CurveTo(85.618515f, 13.141745f, 150.63539f, 7.748014f, 195.41f, 43.63f),
                    PathNode.LineTo(215.51f, 23.52f),
                    PathNode.CurveTo(220.20442f, 18.82558f, 227.81558f, 18.82558f, 232.51f, 23.52f),
                    PathNode.CurveTo(237.20442f, 28.21442f, 237.20442f, 35.82558f, 232.51f, 40.52f),
                    PathNode.LineTo(136.51f, 136.52f),
                    PathNode.CurveTo(131.81558f, 141.21442f, 124.20442f, 141.21442f, 119.51f, 136.52f),
                    PathNode.CurveTo(114.81558f, 131.82558f, 114.81558f, 124.214424f, 119.51f, 119.52f),
                    PathNode.LineTo(143.51f, 95.52f),
                    PathNode.CurveTo(129.64333f, 88.894936f, 113.10008f, 91.80294f, 102.32398f, 102.75976f),
                    PathNode.CurveTo(91.54788f, 113.716576f, 88.91539f, 130.3059f, 95.770134f, 144.06047f),
                    PathNode.CurveTo(102.62488f, 157.81506f, 117.45518f, 165.7016f, 132.6916f, 163.6948f),
                    PathNode.CurveTo(147.92804f, 161.68799f, 160.21051f, 150.2304f, 163.27f, 135.17f),
                    PathNode.CurveTo(164.57892f, 128.67236f, 170.90736f, 124.46609f, 177.405f, 125.775f),
                    PathNode.CurveTo(183.90263f, 127.083916f, 188.10892f, 133.41237f, 186.8f, 139.91f),
                    PathNode.CurveTo(181.55235f, 165.76012f, 160.03758f, 185.15125f, 133.78304f, 187.69388f),
                    PathNode.CurveTo(107.52847f, 190.23651f, 82.69255f, 175.33424f, 72.58201f, 150.9715f),
                    PathNode.CurveTo(62.47147f, 126.60874f, 69.4579f, 98.50019f, 89.798065f, 81.70602f),
                    PathNode.CurveTo(110.13823f, 64.91184f, 139.06102f, 63.371384f, 161.07f, 77.91f),
                    PathNode.LineTo(178.3f, 60.74f),
                    PathNode.CurveTo(144.8416f, 35.752186f, 98.107704f, 39.13708f, 68.59931f, 68.68552f),
                    PathNode.CurveTo(39.09092f, 98.23397f, 35.76942f, 144.97241f, 60.802597f, 178.3969f),
                    PathNode.CurveTo(85.83577f, 211.82137f, 131.6213f, 221.78122f, 168.27716f, 201.77612f),
                    PathNode.CurveTo(204.93303f, 181.77104f, 221.32721f, 137.87633f, 206.76f, 98.74f),
                    PathNode.CurveTo(205.23364f, 94.71259f, 205.98268f, 90.17608f, 208.72267f, 86.8531f),
                    PathNode.CurveTo(211.46266f, 83.53012f, 215.77333f, 81.93038f, 220.01779f, 82.661354f),
                    PathNode.CurveTo(224.26225f, 83.39233f, 227.78944f, 86.34189f, 229.26f, 90.39f),
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
        return _target!!
    }

private var _target: ImageVector? = null
