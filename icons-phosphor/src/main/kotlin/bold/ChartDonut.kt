package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) return _chartDonut!!
        _chartDonut = phosphorBoldIcon(
            name = "ChartDonut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(121.37258f, 20.0f, 116.0f, 25.372583f, 116.0f, 32.0f),
                    PathNode.LineTo(116.0f, 88.0f),
                    PathNode.CurveTo(116.0f, 94.62742f, 121.37258f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(140.6719f, 100.00511f, 151.76079f, 108.52013f, 155.03682f, 120.76124f),
                    PathNode.CurveTo(158.31285f, 133.00235f, 152.9593f, 145.91779f, 141.98383f, 152.25153f),
                    PathNode.CurveTo(131.00835f, 158.58527f, 117.14722f, 156.75829f, 108.18773f, 147.797f),
                    PathNode.CurveTo(99.22824f, 138.8357f, 97.404045f, 124.9742f, 103.74f, 114.0f),
                    PathNode.CurveTo(105.33393f, 111.24338f, 105.76688f, 107.96626f, 104.94349f, 104.89028f),
                    PathNode.CurveTo(104.1201f, 101.814316f, 102.10791f, 99.19171f, 99.35f, 97.6f),
                    PathNode.LineTo(50.85f, 69.6f),
                    PathNode.CurveTo(45.108986f, 66.289154f, 37.771008f, 68.25908f, 34.46f, 74.0f),
                    PathNode.CurveTo(10.019724f, 116.3318f, 17.058546f, 169.80139f, 51.621574f, 204.36589f),
                    PathNode.CurveTo(86.18461f, 238.9304f, 139.65388f, 245.97153f, 181.98674f, 221.53305f),
                    PathNode.CurveTo(224.31958f, 197.09459f, 244.96071f, 147.27005f, 232.31253f, 100.054245f),
                    PathNode.CurveTo(219.66435f, 52.838448f, 176.88055f, 20.004189f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(50.0f, 96.81f),
                    PathNode.LineTo(78.2f, 113.09f),
                    PathNode.CurveTo(76.747604f, 117.92704f, 76.006516f, 122.949615f, 76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 128.5f, 76.0f, 129.0f, 76.0f, 129.5f),
                    PathNode.LineTo(44.57f, 137.92f),
                    PathNode.CurveTo(44.182564f, 134.62762f, 43.992226f, 131.31506f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.00687f, 117.31719f, 46.04296f, 106.73292f, 50.0f, 96.81f),
                    PathNode.Close,
                    PathNode.MoveTo(50.83f, 161.11f),
                    PathNode.LineTo(82.26f, 152.68f),
                    PathNode.CurveTo(89.31761f, 165.71555f, 101.5846f, 175.13576f, 116.0f, 178.59f),
                    PathNode.LineTo(116.0f, 211.13f),
                    PathNode.CurveTo(87.06184f, 206.89989f, 62.38678f, 187.96683f, 50.81f, 161.11f),
                    PathNode.Close,
                    PathNode.MoveTo(140.02f, 211.11f),
                    PathNode.LineTo(140.02f, 178.59f),
                    PathNode.CurveTo(163.46172f, 173.02245f, 180.00868f, 152.0809f, 180.00392f, 127.9871f),
                    PathNode.CurveTo(179.99916f, 103.89329f, 163.44391f, 82.95829f, 140.0f, 77.4f),
                    PathNode.LineTo(140.0f, 44.85f),
                    PathNode.CurveTo(181.33296f, 50.81041f, 212.01082f, 86.229485f, 212.01082f, 127.99f),
                    PathNode.CurveTo(212.01082f, 169.75052f, 181.33296f, 205.16959f, 140.0f, 211.13f),
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
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null
