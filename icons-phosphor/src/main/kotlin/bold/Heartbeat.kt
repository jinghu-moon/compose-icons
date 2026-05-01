package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) return _heartbeat!!
        _heartbeat = phosphorBoldIcon(
            name = "Heartbeat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(71.76f, 148.0f),
                    PathNode.LineTo(31.7f, 148.0f),
                    PathNode.CurveTo(25.072582f, 148.0f, 19.7f, 142.62741f, 19.7f, 136.0f),
                    PathNode.CurveTo(19.7f, 129.37259f, 25.072582f, 124.0f, 31.7f, 124.0f),
                    PathNode.LineTo(65.33f, 124.0f),
                    PathNode.LineTo(77.78f, 105.34f),
                    PathNode.CurveTo(80.003296f, 101.98826f, 83.75791f, 99.97325f, 87.78f, 99.97325f),
                    PathNode.CurveTo(91.80209f, 99.97325f, 95.55671f, 101.98826f, 97.78f, 105.34f),
                    PathNode.LineTo(119.78f, 138.34f),
                    PathNode.LineTo(125.78f, 129.34f),
                    PathNode.CurveTo(128.00945f, 125.99844f, 131.76299f, 123.99405f, 135.78f, 124.0f),
                    PathNode.LineTo(159.78f, 124.0f),
                    PathNode.CurveTo(166.40741f, 124.0f, 171.78f, 129.37259f, 171.78f, 136.0f),
                    PathNode.CurveTo(171.78f, 142.62741f, 166.40741f, 148.0f, 159.78f, 148.0f),
                    PathNode.LineTo(142.18f, 148.0f),
                    PathNode.LineTo(129.72f, 166.66f),
                    PathNode.CurveTo(127.496704f, 170.01175f, 123.74209f, 172.02675f, 119.72f, 172.02675f),
                    PathNode.CurveTo(115.69791f, 172.02675f, 111.94329f, 170.01175f, 109.72f, 166.66f),
                    PathNode.LineTo(87.72f, 133.66f),
                    PathNode.LineTo(81.72f, 142.66f),
                    PathNode.CurveTo(79.49843f, 145.98978f, 75.76284f, 147.9926f, 71.76f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(177.91f, 36.0f),
                    PathNode.CurveTo(157.79f, 36.0f, 139.91f, 43.93f, 127.84f, 57.56f),
                    PathNode.CurveTo(115.74f, 43.93f, 97.89f, 36.0f, 77.76f, 36.0f),
                    PathNode.CurveTo(44.10475f, 35.950447f, 15.802641f, 61.232346f, 12.07f, 94.68f),
                    PathNode.CurveTo(11.340984f, 101.288086f, 16.106913f, 107.235985f, 22.715f, 107.965f),
                    PathNode.CurveTo(29.323088f, 108.694016f, 35.270985f, 103.928085f, 36.0f, 97.32f),
                    PathNode.CurveTo(38.383812f, 76.06002f, 56.366795f, 59.98902f, 77.76f, 60.0f),
                    PathNode.CurveTo(95.59f, 60.0f, 110.51f, 69.4f, 116.71f, 84.54f),
                    PathNode.CurveTo(118.543236f, 89.07392f, 122.94448f, 92.04173f, 127.835f, 92.04173f),
                    PathNode.CurveTo(132.72552f, 92.04173f, 137.12677f, 89.07392f, 138.96f, 84.54f),
                    PathNode.CurveTo(145.16f, 69.4f, 160.08f, 60.0f, 177.91f, 60.0f),
                    PathNode.CurveTo(201.12283f, 59.99444f, 219.95587f, 78.7872f, 220.0f, 102.0f),
                    PathNode.CurveTo(220.0f, 131.42f, 194.14f, 159.77f, 172.44f, 178.36f),
                    PathNode.CurveTo(158.48987f, 190.18385f, 143.57822f, 200.82404f, 127.86f, 210.17f),
                    PathNode.CurveTo(116.99f, 203.72f, 92.49f, 188.17f, 71.35f, 167.44f),
                    PathNode.CurveTo(66.622444f, 162.78976f, 59.020237f, 162.85245f, 54.37f, 167.58f),
                    PathNode.CurveTo(49.71976f, 172.30756f, 49.782444f, 179.90976f, 54.51f, 184.56f),
                    PathNode.CurveTo(84.9f, 214.37f, 120.66f, 233.76f, 122.17f, 234.56f),
                    PathNode.CurveTo(125.7275f, 236.4658f, 130.0025f, 236.4658f, 133.56f, 234.56f),
                    PathNode.CurveTo(138.0f, 232.14f, 244.0f, 174.34f, 244.0f, 102.0f),
                    PathNode.CurveTo(243.93384f, 65.54151f, 214.36855f, 36.016483f, 177.91f, 36.0f),
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
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null
