package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TennisBall: ImageVector
    get() {
        if (_tennisBall != null) return _tennisBall!!
        _tennisBall = phosphorLightIcon(
            name = "TennisBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.16f, 55.88f),
                    PathNode.CurveTo(170.9893f, 26.705336f, 127.116196f, 17.976112f, 88.9997f, 33.762962f),
                    PathNode.CurveTo(50.883217f, 49.549816f, 26.030216f, 86.74359f, 26.030216f, 128.0f),
                    PathNode.CurveTo(26.030216f, 169.25641f, 50.883217f, 206.45018f, 88.9997f, 222.23703f),
                    PathNode.CurveTo(127.116196f, 238.0239f, 170.9893f, 229.29466f, 200.16f, 200.12f),
                    PathNode.CurveTo(219.43405f, 181.07076f, 230.28122f, 155.09914f, 230.28122f, 128.0f),
                    PathNode.CurveTo(230.28122f, 100.90086f, 219.43405f, 74.929245f, 200.16f, 55.88f),
                    PathNode.Close,
                    PathNode.MoveTo(64.33f, 64.36f),
                    PathNode.CurveTo(79.636406f, 49.037937f, 99.97351f, 39.777008f, 121.58f, 38.29f),
                    PathNode.CurveTo(120.08978f, 59.8854f, 110.80782f, 80.20479f, 95.46f, 95.47f),
                    PathNode.CurveTo(80.18248f, 110.81617f, 59.85324f, 120.09421f, 38.25f, 121.58f),
                    PathNode.CurveTo(39.745907f, 99.98249f, 49.010075f, 79.65673f, 64.33f, 64.36f),
                    PathNode.Close,
                    PathNode.MoveTo(38.2f, 133.63f),
                    PathNode.CurveTo(63.02555f, 132.15991f, 86.444275f, 121.61436f, 104.0f, 104.0f),
                    PathNode.CurveTo(121.624275f, 86.47869f, 132.18828f, 63.08698f, 133.68f, 38.28f),
                    PathNode.CurveTo(178.96654f, 41.021282f, 215.08719f, 77.12476f, 217.85f, 122.41f),
                    PathNode.CurveTo(166.54874f, 125.61923f, 125.65074f, 166.50009f, 122.42f, 217.8f),
                    PathNode.CurveTo(77.09965f, 215.0809f, 40.946003f, 178.94873f, 38.2f, 133.63f),
                    PathNode.Close,
                    PathNode.MoveTo(191.67f, 191.63f),
                    PathNode.CurveTo(176.36156f, 206.94763f, 156.02492f, 216.2048f, 134.42f, 217.69f),
                    PathNode.CurveTo(137.61993f, 173.06935f, 173.12744f, 137.58316f, 217.75f, 134.41f),
                    PathNode.CurveTo(216.25645f, 156.01105f, 206.99211f, 176.34073f, 191.67f, 191.64f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tennisBall!!
    }

private var _tennisBall: ImageVector? = null
