package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Airplay: ImageVector
    get() {
        if (_airplay != null) return _airplay!!
        _airplay = phosphorFillIcon(
            name = "Airplay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(174.15f, 210.88f),
                    PathNode.CurveTo(176.13678f, 213.26529f, 176.56425f, 216.58463f, 175.24667f, 219.39548f),
                    PathNode.CurveTo(173.9291f, 222.20631f, 171.10434f, 224.00114f, 168.0f, 224.0f),
                    PathNode.LineTo(88.0f, 224.0f),
                    PathNode.CurveTo(84.89566f, 224.00114f, 82.070915f, 222.20631f, 80.75333f, 219.39548f),
                    PathNode.CurveTo(79.435745f, 216.58463f, 79.86322f, 213.26529f, 81.85f, 210.88f),
                    PathNode.LineTo(121.85f, 162.88f),
                    PathNode.CurveTo(123.36996f, 161.05661f, 125.621185f, 160.0024f, 127.995f, 160.0024f),
                    PathNode.CurveTo(130.36882f, 160.0024f, 132.62004f, 161.05661f, 134.14f, 162.88f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 40.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(34.745167f, 40.0f, 24.0f, 50.745167f, 24.0f, 64.0f),
                    PathNode.LineTo(24.0f, 176.0f),
                    PathNode.CurveTo(24.0f, 189.25484f, 34.745167f, 200.0f, 48.0f, 200.0f),
                    PathNode.LineTo(68.22f, 200.0f),
                    PathNode.CurveTo(69.40623f, 199.99896f, 70.530815f, 199.47147f, 71.29f, 198.56f),
                    PathNode.LineTo(109.57f, 152.64f),
                    PathNode.CurveTo(114.70604f, 146.46948f, 122.58725f, 143.27573f, 130.57f, 144.13f),
                    PathNode.CurveTo(136.94296f, 144.88396f, 142.77165f, 148.09064f, 146.82f, 153.07f),
                    PathNode.LineTo(184.73f, 198.56f),
                    PathNode.CurveTo(185.48918f, 199.47147f, 186.61377f, 199.99896f, 187.8f, 200.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.CurveTo(221.25484f, 200.0f, 232.0f, 189.25484f, 232.0f, 176.0f),
                    PathNode.LineTo(232.0f, 64.0f),
                    PathNode.CurveTo(232.0f, 50.745167f, 221.25484f, 40.0f, 208.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _airplay!!
    }

private var _airplay: ImageVector? = null
