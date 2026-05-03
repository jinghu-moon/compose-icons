package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FloppyDisk: ImageVector
    get() {
        if (_floppyDisk != null) return _floppyDisk!!
        _floppyDisk = phosphorThinIcon(
            name = "FloppyDisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.49f, 74.83f),
                    PathNode.LineTo(181.17f, 39.51f),
                    PathNode.CurveTo(178.92447f, 37.256035f, 175.87163f, 35.99242f, 172.69f, 36.0f),
                    PathNode.LineTo(48.0f, 36.0f),
                    PathNode.CurveTo(41.37258f, 36.0f, 36.0f, 41.37258f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(214.62741f, 220.0f, 220.0f, 214.62741f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 83.31f),
                    PathNode.CurveTo(220.00758f, 80.12837f, 218.74396f, 77.07554f, 216.49f, 74.83f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 212.0f),
                    PathNode.LineTo(84.0f, 212.0f),
                    PathNode.LineTo(84.0f, 152.0f),
                    PathNode.CurveTo(84.0f, 149.79086f, 85.79086f, 148.0f, 88.0f, 148.0f),
                    PathNode.LineTo(168.0f, 148.0f),
                    PathNode.CurveTo(170.20914f, 148.0f, 172.0f, 149.79086f, 172.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
                    PathNode.LineTo(180.0f, 212.0f),
                    PathNode.LineTo(180.0f, 152.0f),
                    PathNode.CurveTo(180.0f, 145.37259f, 174.62741f, 140.0f, 168.0f, 140.0f),
                    PathNode.LineTo(88.0f, 140.0f),
                    PathNode.CurveTo(81.37258f, 140.0f, 76.0f, 145.37259f, 76.0f, 152.0f),
                    PathNode.LineTo(76.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 48.0f),
                    PathNode.CurveTo(44.0f, 45.79086f, 45.79086f, 44.0f, 48.0f, 44.0f),
                    PathNode.LineTo(172.69f, 44.0f),
                    PathNode.CurveTo(173.74773f, 44.001812f, 174.76166f, 44.422493f, 175.51f, 45.17f),
                    PathNode.LineTo(210.83f, 80.49f),
                    PathNode.CurveTo(211.57751f, 81.238335f, 211.9982f, 82.25228f, 212.0f, 83.31f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 72.0f),
                    PathNode.CurveTo(156.0f, 74.20914f, 154.20914f, 76.0f, 152.0f, 76.0f),
                    PathNode.LineTo(96.0f, 76.0f),
                    PathNode.CurveTo(93.79086f, 76.0f, 92.0f, 74.20914f, 92.0f, 72.0f),
                    PathNode.CurveTo(92.0f, 69.79086f, 93.79086f, 68.0f, 96.0f, 68.0f),
                    PathNode.LineTo(152.0f, 68.0f),
                    PathNode.CurveTo(154.20914f, 68.0f, 156.0f, 69.79086f, 156.0f, 72.0f),
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
        return _floppyDisk!!
    }

private var _floppyDisk: ImageVector? = null
