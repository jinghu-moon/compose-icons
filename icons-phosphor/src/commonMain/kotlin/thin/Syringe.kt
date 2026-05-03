package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Syringe: ImageVector
    get() {
        if (_syringe != null) return _syringe!!
        _syringe = phosphorThinIcon(
            name = "Syringe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.83f, 69.17f),
                    PathNode.LineTo(186.83f, 21.17f),
                    PathNode.CurveTo(185.26703f, 19.607035f, 182.73297f, 19.607035f, 181.17f, 21.17f),
                    PathNode.CurveTo(179.60704f, 22.732965f, 179.60704f, 25.267035f, 181.17f, 26.83f),
                    PathNode.LineTo(202.34f, 48.0f),
                    PathNode.LineTo(168.0f, 82.34f),
                    PathNode.LineTo(130.83f, 45.17f),
                    PathNode.CurveTo(129.26703f, 43.607033f, 126.73296f, 43.607033f, 125.17f, 45.17f),
                    PathNode.CurveTo(123.60703f, 46.732967f, 123.60703f, 49.267033f, 125.17f, 50.83f),
                    PathNode.LineTo(134.34f, 60.0f),
                    PathNode.LineTo(47.51f, 146.83f),
                    PathNode.CurveTo(45.26259f, 149.07991f, 44.00015f, 152.12991f, 44.0f, 155.31f),
                    PathNode.LineTo(44.0f, 206.31f),
                    PathNode.LineTo(21.17f, 229.17f),
                    PathNode.CurveTo(19.607035f, 230.73297f, 19.607035f, 233.26703f, 21.17f, 234.83f),
                    PathNode.CurveTo(22.732965f, 236.39296f, 25.267035f, 236.39296f, 26.83f, 234.83f),
                    PathNode.LineTo(49.66f, 212.0f),
                    PathNode.LineTo(100.66f, 212.0f),
                    PathNode.CurveTo(103.84162f, 212.00758f, 106.89446f, 210.74396f, 109.14f, 208.49f),
                    PathNode.LineTo(196.0f, 121.66f),
                    PathNode.LineTo(205.17f, 130.83f),
                    PathNode.CurveTo(206.73297f, 132.39296f, 209.26703f, 132.39296f, 210.83f, 130.83f),
                    PathNode.CurveTo(212.39296f, 129.26703f, 212.39296f, 126.73296f, 210.83f, 125.17f),
                    PathNode.LineTo(173.66f, 88.0f),
                    PathNode.LineTo(208.0f, 53.66f),
                    PathNode.LineTo(229.17f, 74.83f),
                    PathNode.CurveTo(230.73297f, 76.39297f, 233.26703f, 76.39297f, 234.83f, 74.83f),
                    PathNode.CurveTo(236.39296f, 73.26704f, 236.39296f, 70.73296f, 234.83f, 69.17f),
                    PathNode.Close,
                    PathNode.MoveTo(103.51f, 202.83f),
                    PathNode.CurveTo(102.761665f, 203.57751f, 101.74772f, 203.9982f, 100.69f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 155.31f),
                    PathNode.CurveTo(52.001812f, 154.25227f, 52.422493f, 153.23834f, 53.17f, 152.49f),
                    PathNode.LineTo(74.0f, 131.66f),
                    PathNode.LineTo(97.17f, 154.83f),
                    PathNode.CurveTo(98.73296f, 156.39296f, 101.26704f, 156.39296f, 102.83f, 154.83f),
                    PathNode.CurveTo(104.39297f, 153.26703f, 104.39297f, 150.73297f, 102.83f, 149.17f),
                    PathNode.LineTo(79.66f, 126.0f),
                    PathNode.LineTo(98.0f, 107.66f),
                    PathNode.LineTo(121.17f, 130.83f),
                    PathNode.CurveTo(122.73296f, 132.39296f, 125.26704f, 132.39296f, 126.83f, 130.83f),
                    PathNode.CurveTo(128.39296f, 129.26703f, 128.39296f, 126.73296f, 126.83f, 125.17f),
                    PathNode.LineTo(103.66f, 102.0f),
                    PathNode.LineTo(140.0f, 65.66f),
                    PathNode.LineTo(165.17f, 90.83f),
                    PathNode.LineTo(165.17f, 90.83f),
                    PathNode.LineTo(190.34f, 116.0f),
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
        return _syringe!!
    }

private var _syringe: ImageVector? = null
