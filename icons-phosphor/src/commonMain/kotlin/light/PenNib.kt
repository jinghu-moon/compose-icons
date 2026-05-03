package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PenNib: ImageVector
    get() {
        if (_penNib != null) return _penNib!!
        _penNib = phosphorLightIcon(
            name = "PenNib",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.0f, 92.68f),
                    PathNode.CurveTo(246.0069f, 88.96555f, 244.53107f, 85.40196f, 241.9f, 82.78f),
                    PathNode.LineTo(173.21f, 14.1f),
                    PathNode.CurveTo(170.58444f, 11.474182f, 167.02328f, 9.99899f, 163.31f, 9.99899f),
                    PathNode.CurveTo(159.59673f, 9.99899f, 156.03555f, 11.474182f, 153.41f, 14.1f),
                    PathNode.LineTo(124.68f, 42.83f),
                    PathNode.LineTo(66.22f, 64.76f),
                    PathNode.CurveTo(61.53776f, 66.512634f, 58.145477f, 70.62911f, 57.32f, 75.56f),
                    PathNode.LineTo(34.08f, 215.0f),
                    PathNode.CurveTo(33.785534f, 216.7421f, 34.273857f, 218.52544f, 35.41477f, 219.87448f),
                    PathNode.CurveTo(36.555683f, 221.22353f, 38.23319f, 222.00114f, 40.0f, 222.0f),
                    PathNode.CurveTo(40.334877f, 221.9987f, 40.669174f, 221.97195f, 41.0f, 221.92f),
                    PathNode.LineTo(180.44f, 198.68f),
                    PathNode.CurveTo(185.37468f, 197.8578f, 189.49562f, 194.46498f, 191.25f, 189.78f),
                    PathNode.LineTo(213.17f, 131.32f),
                    PathNode.LineTo(241.91f, 102.58f),
                    PathNode.CurveTo(244.53928f, 99.95765f, 246.01176f, 96.39345f, 246.0f, 92.68f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 185.57f),
                    PathNode.CurveTo(179.74971f, 186.23755f, 179.163f, 186.7214f, 178.46f, 186.84f),
                    PathNode.LineTo(57.49f, 207.0f),
                    PathNode.LineTo(110.36f, 154.12f),
                    PathNode.CurveTo(121.587715f, 161.0452f, 136.22215f, 158.46465f, 144.40405f, 148.11685f),
                    PathNode.CurveTo(152.58594f, 137.76906f, 151.72186f, 122.93397f, 142.39395f, 113.60606f),
                    PathNode.CurveTo(133.06602f, 104.27814f, 118.23094f, 103.414055f, 107.88315f, 111.59594f),
                    PathNode.CurveTo(97.53536f, 119.77783f, 94.95479f, 134.41228f, 101.88f, 145.64f),
                    PathNode.LineTo(49.0f, 198.53f),
                    PathNode.LineTo(69.17f, 77.53f),
                    PathNode.CurveTo(69.289986f, 76.833115f, 69.76905f, 76.25139f, 70.43f, 76.0f),
                    PathNode.LineTo(126.49f, 55.0f),
                    PathNode.LineTo(201.0f, 129.51f),
                    PathNode.Close,
                    PathNode.MoveTo(110.0f, 132.0f),
                    PathNode.CurveTo(110.0f, 124.26801f, 116.26801f, 118.0f, 124.0f, 118.0f),
                    PathNode.CurveTo(131.73198f, 118.0f, 138.0f, 124.26801f, 138.0f, 132.0f),
                    PathNode.CurveTo(138.0f, 139.73198f, 131.73198f, 146.0f, 124.0f, 146.0f),
                    PathNode.CurveTo(116.26801f, 146.0f, 110.0f, 139.73198f, 110.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(233.41f, 94.1f),
                    PathNode.LineTo(208.0f, 119.51f),
                    PathNode.LineTo(136.48f, 48.0f),
                    PathNode.LineTo(161.9f, 22.58f),
                    PathNode.CurveTo(162.27513f, 22.204447f, 162.78418f, 21.993427f, 163.315f, 21.993427f),
                    PathNode.CurveTo(163.84583f, 21.993427f, 164.35486f, 22.204447f, 164.73f, 22.58f),
                    PathNode.LineTo(233.41f, 91.27f),
                    PathNode.CurveTo(233.78555f, 91.645134f, 233.99657f, 92.15418f, 233.99657f, 92.685f),
                    PathNode.CurveTo(233.99657f, 93.21582f, 233.78555f, 93.72486f, 233.41f, 94.1f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _penNib!!
    }

private var _penNib: ImageVector? = null
