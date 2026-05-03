package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pill: ImageVector
    get() {
        if (_pill != null) return _pill!!
        _pill = phosphorThinIcon(
            name = "Pill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(186.84f, 85.17f),
                    PathNode.CurveTo(187.59111f, 85.92027f, 188.01315f, 86.93836f, 188.01315f, 88.0f),
                    PathNode.CurveTo(188.01315f, 89.06164f, 187.59111f, 90.07973f, 186.84f, 90.83f),
                    PathNode.LineTo(162.84f, 114.83f),
                    PathNode.CurveTo(161.27704f, 116.39297f, 158.74297f, 116.39297f, 157.18f, 114.83f),
                    PathNode.CurveTo(155.61703f, 113.26704f, 155.61703f, 110.73296f, 157.18f, 109.17f),
                    PathNode.LineTo(181.18f, 85.17f),
                    PathNode.CurveTo(181.93027f, 84.418884f, 182.94836f, 83.99686f, 184.01f, 83.99686f),
                    PathNode.CurveTo(185.07166f, 83.99686f, 186.08972f, 84.418884f, 186.84f, 85.17f),
                    PathNode.Close,
                    PathNode.MoveTo(213.59f, 112.08f),
                    PathNode.LineTo(112.08f, 213.57f),
                    PathNode.CurveTo(92.786514f, 232.45178f, 61.88998f, 232.28741f, 42.79849f, 213.2014f),
                    PathNode.CurveTo(23.707003f, 194.11539f, 23.533752f, 163.2189f, 42.41f, 143.92f),
                    PathNode.LineTo(143.92f, 42.43f),
                    PathNode.CurveTo(163.21349f, 23.548212f, 194.11002f, 23.712591f, 213.2015f, 42.7986f),
                    PathNode.CurveTo(232.293f, 61.884605f, 232.46625f, 92.78109f, 213.59f, 112.08f),
                    PathNode.Close,
                    PathNode.MoveTo(154.35f, 160.0f),
                    PathNode.LineTo(96.0f, 101.66f),
                    PathNode.LineTo(48.06f, 149.57f),
                    PathNode.CurveTo(31.947092f, 165.68567f, 31.949331f, 191.8121f, 48.065f, 207.925f),
                    PathNode.CurveTo(64.18067f, 224.0379f, 90.30709f, 224.03568f, 106.42f, 207.92f),
                    PathNode.Close,
                    PathNode.MoveTo(207.94f, 48.08f),
                    PathNode.CurveTo(191.82132f, 31.971643f, 165.6987f, 31.971643f, 149.58f, 48.08f),
                    PathNode.LineTo(101.65f, 96.0f),
                    PathNode.LineTo(160.0f, 154.34f),
                    PathNode.LineTo(207.93f, 106.43f),
                    PathNode.CurveTo(224.01244f, 90.3061f, 224.0169f, 64.20941f, 207.94f, 48.08f),
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
        return _pill!!
    }

private var _pill: ImageVector? = null
