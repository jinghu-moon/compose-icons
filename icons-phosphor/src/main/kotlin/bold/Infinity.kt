package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Infinity: ImageVector
    get() {
        if (_infinity != null) return _infinity!!
        _infinity = phosphorBoldIcon(
            name = "Infinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(252.0f, 128.0f),
                    PathNode.CurveTo(252.00291f, 152.26997f, 237.38434f, 174.15144f, 214.96198f, 183.43954f),
                    PathNode.CurveTo(192.53961f, 192.72766f, 166.73001f, 187.59291f, 149.57f, 170.43f),
                    PathNode.LineTo(149.08f, 169.9f),
                    PathNode.LineTo(89.22f, 102.31f),
                    PathNode.CurveTo(75.093575f, 88.44228f, 52.42083f, 88.58197f, 38.466347f, 102.62269f),
                    PathNode.CurveTo(24.511866f, 116.663414f, 24.511866f, 139.3366f, 38.466347f, 153.37732f),
                    PathNode.CurveTo(52.42083f, 167.41803f, 75.093575f, 167.55771f, 89.22f, 153.69f),
                    PathNode.LineTo(92.3f, 150.21f),
                    PathNode.CurveTo(96.693436f, 145.23944f, 104.28444f, 144.77156f, 109.255f, 149.165f),
                    PathNode.CurveTo(114.22556f, 153.55843f, 114.693436f, 161.14944f, 110.3f, 166.12f),
                    PathNode.LineTo(106.95f, 169.9f),
                    PathNode.LineTo(106.46f, 170.43f),
                    PathNode.CurveTo(83.0275f, 193.85852f, 45.039444f, 193.8564f, 21.609583f, 170.42522f),
                    PathNode.CurveTo(-1.820279f, 146.99402f, -1.820279f, 109.005974f, 21.609583f, 85.57479f),
                    PathNode.CurveTo(45.039444f, 62.14361f, 83.0275f, 62.141464f, 106.46f, 85.57f),
                    PathNode.LineTo(106.95f, 86.1f),
                    PathNode.LineTo(166.81f, 153.69f),
                    PathNode.CurveTo(180.93643f, 167.55771f, 203.60918f, 167.41803f, 217.56366f, 153.37732f),
                    PathNode.CurveTo(231.51813f, 139.3366f, 231.51813f, 116.663414f, 217.56366f, 102.62269f),
                    PathNode.CurveTo(203.60918f, 88.58197f, 180.93643f, 88.44228f, 166.81f, 102.31f),
                    PathNode.LineTo(163.73f, 105.79f),
                    PathNode.CurveTo(159.33658f, 110.76056f, 151.74554f, 111.228424f, 146.775f, 106.835f),
                    PathNode.CurveTo(141.80444f, 102.441574f, 141.33658f, 94.85056f, 145.73f, 89.88f),
                    PathNode.LineTo(149.08f, 86.1f),
                    PathNode.LineTo(149.57f, 85.57f),
                    PathNode.CurveTo(166.73001f, 68.40709f, 192.53961f, 63.272335f, 214.96198f, 72.56044f),
                    PathNode.CurveTo(237.38434f, 81.84855f, 252.00291f, 103.730034f, 252.0f, 128.0f),
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
        return _infinity!!
    }

private var _infinity: ImageVector? = null
