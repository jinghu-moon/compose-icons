package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SecurityCamera: ImageVector
    get() {
        if (_securityCamera != null) return _securityCamera!!
        _securityCamera = phosphorThinIcon(
            name = "SecurityCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 140.0f),
                    PathNode.CurveTo(245.79086f, 140.0f, 244.0f, 141.79086f, 244.0f, 144.0f),
                    PathNode.LineTo(244.0f, 164.0f),
                    PathNode.LineTo(195.31f, 164.0f),
                    PathNode.CurveTo(194.25227f, 163.9982f, 193.23834f, 163.57751f, 192.49f, 162.83f),
                    PathNode.LineTo(171.31f, 141.66f),
                    PathNode.LineTo(224.49f, 88.49f),
                    PathNode.CurveTo(226.74945f, 86.23838f, 228.01947f, 83.17982f, 228.01947f, 79.99f),
                    PathNode.CurveTo(228.01947f, 76.80018f, 226.74945f, 73.74162f, 224.49f, 71.49f),
                    PathNode.LineTo(168.49f, 15.49f),
                    PathNode.CurveTo(166.23837f, 13.230546f, 163.17982f, 11.960537f, 159.99f, 11.960537f),
                    PathNode.CurveTo(156.80019f, 11.960537f, 153.74162f, 13.230546f, 151.49f, 15.49f),
                    PathNode.LineTo(5.76f, 161.76f),
                    PathNode.CurveTo(4.046238f, 163.47589f, 3.533934f, 166.05473f, 4.461705f, 168.2954f),
                    PathNode.CurveTo(5.389474f, 170.53604f, 7.574867f, 171.99785f, 10.0f, 172.0f),
                    PathNode.LineTo(51.0f, 172.0f),
                    PathNode.LineTo(87.48f, 208.49f),
                    PathNode.CurveTo(89.73162f, 210.74945f, 92.790184f, 212.01947f, 95.98f, 212.01947f),
                    PathNode.CurveTo(99.169815f, 212.01947f, 102.22838f, 210.74945f, 104.48f, 208.49f),
                    PathNode.LineTo(165.66f, 147.31f),
                    PathNode.LineTo(186.83f, 168.48f),
                    PathNode.CurveTo(189.07199f, 170.74046f, 192.12627f, 172.00829f, 195.31f, 172.0f),
                    PathNode.LineTo(244.0f, 172.0f),
                    PathNode.LineTo(244.0f, 192.0f),
                    PathNode.CurveTo(244.0f, 194.20914f, 245.79086f, 196.0f, 248.0f, 196.0f),
                    PathNode.CurveTo(250.20914f, 196.0f, 252.0f, 194.20914f, 252.0f, 192.0f),
                    PathNode.LineTo(252.0f, 144.0f),
                    PathNode.CurveTo(252.0f, 141.79086f, 250.20914f, 140.0f, 248.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(157.17f, 21.17f),
                    PathNode.CurveTo(158.75409f, 19.658886f, 161.24591f, 19.658886f, 162.83f, 21.17f),
                    PathNode.LineTo(178.34f, 36.69f),
                    PathNode.LineTo(51.0f, 164.0f),
                    PathNode.LineTo(14.82f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(98.83f, 202.83f),
                    PathNode.CurveTo(97.24591f, 204.34111f, 94.75409f, 204.34111f, 93.17f, 202.83f),
                    PathNode.LineTo(58.34f, 168.0f),
                    PathNode.LineTo(184.0f, 42.34f),
                    PathNode.LineTo(218.83f, 77.17f),
                    PathNode.CurveTo(219.58112f, 77.92027f, 220.00314f, 78.93836f, 220.00314f, 80.0f),
                    PathNode.CurveTo(220.00314f, 81.06164f, 219.58112f, 82.07973f, 218.83f, 82.83f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _securityCamera!!
    }

private var _securityCamera: ImageVector? = null
