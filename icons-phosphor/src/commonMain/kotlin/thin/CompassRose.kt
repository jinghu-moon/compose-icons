package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CompassRose: ImageVector
    get() {
        if (_compassRose != null) return _compassRose!!
        _compassRose = phosphorThinIcon(
            name = "CompassRose",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(249.0f, 124.12f),
                    PathNode.LineTo(219.32f, 116.7f),
                    PathNode.CurveTo(214.19363f, 74.82375f, 181.19624f, 41.82637f, 139.32f, 36.7f),
                    PathNode.LineTo(131.88f, 7.0f),
                    PathNode.CurveTo(131.434f, 5.220443f, 129.8346f, 3.97242f, 128.0f, 3.97242f),
                    PathNode.CurveTo(126.165405f, 3.97242f, 124.566f, 5.220443f, 124.12f, 7.0f),
                    PathNode.LineTo(116.7f, 36.71f),
                    PathNode.CurveTo(74.82375f, 41.83637f, 41.82637f, 74.833755f, 36.7f, 116.71f),
                    PathNode.LineTo(7.0f, 124.12f),
                    PathNode.CurveTo(5.220443f, 124.566f, 3.97242f, 126.165405f, 3.97242f, 128.0f),
                    PathNode.CurveTo(3.97242f, 129.8346f, 5.220443f, 131.434f, 7.0f, 131.88f),
                    PathNode.LineTo(36.68f, 139.3f),
                    PathNode.CurveTo(41.80637f, 181.17624f, 74.80376f, 214.17363f, 116.68f, 219.3f),
                    PathNode.LineTo(124.12f, 249.0f),
                    PathNode.CurveTo(124.566f, 250.77956f, 126.165405f, 252.02759f, 128.0f, 252.02759f),
                    PathNode.CurveTo(129.8346f, 252.02759f, 131.434f, 250.77956f, 131.88f, 249.0f),
                    PathNode.LineTo(139.3f, 219.32f),
                    PathNode.CurveTo(181.17624f, 214.19363f, 214.17363f, 181.19624f, 219.3f, 139.32f),
                    PathNode.LineTo(249.0f, 131.88f),
                    PathNode.CurveTo(250.77956f, 131.434f, 252.02759f, 129.8346f, 252.02759f, 128.0f),
                    PathNode.CurveTo(252.02759f, 126.165405f, 250.77956f, 124.566f, 249.0f, 124.12f),
                    PathNode.Close,
                    PathNode.MoveTo(210.95f, 114.61f),
                    PathNode.LineTo(155.3f, 100.7f),
                    PathNode.LineTo(141.39f, 45.08f),
                    PathNode.CurveTo(177.15019f, 50.809036f, 205.19096f, 78.84981f, 210.92f, 114.61f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 24.49f),
                    PathNode.LineTo(147.57f, 102.77f),
                    PathNode.LineTo(128.0f, 122.34f),
                    PathNode.LineTo(108.43f, 102.77f),
                    PathNode.Close,
                    PathNode.MoveTo(114.61f, 45.08f),
                    PathNode.LineTo(100.7f, 100.7f),
                    PathNode.LineTo(45.08f, 114.61f),
                    PathNode.CurveTo(50.809036f, 78.84981f, 78.84981f, 50.809036f, 114.61f, 45.08f),
                    PathNode.Close,
                    PathNode.MoveTo(102.77f, 108.43f),
                    PathNode.LineTo(122.34f, 128.0f),
                    PathNode.LineTo(102.77f, 147.57f),
                    PathNode.LineTo(24.49f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(45.08f, 141.43f),
                    PathNode.LineTo(100.7f, 155.3f),
                    PathNode.LineTo(114.61f, 210.92f),
                    PathNode.CurveTo(78.84981f, 205.19096f, 50.809036f, 177.15019f, 45.08f, 141.39f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 231.51f),
                    PathNode.LineTo(108.43f, 153.23f),
                    PathNode.LineTo(128.0f, 133.66f),
                    PathNode.LineTo(147.57f, 153.23f),
                    PathNode.Close,
                    PathNode.MoveTo(141.39f, 210.92f),
                    PathNode.LineTo(155.3f, 155.3f),
                    PathNode.LineTo(210.92f, 141.39f),
                    PathNode.CurveTo(205.19096f, 177.15019f, 177.15019f, 205.19096f, 141.39f, 210.92f),
                    PathNode.Close,
                    PathNode.MoveTo(153.23f, 147.57f),
                    PathNode.LineTo(133.66f, 128.0f),
                    PathNode.LineTo(153.23f, 108.43f),
                    PathNode.LineTo(231.51f, 128.0f),
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
        return _compassRose!!
    }

private var _compassRose: ImageVector? = null
