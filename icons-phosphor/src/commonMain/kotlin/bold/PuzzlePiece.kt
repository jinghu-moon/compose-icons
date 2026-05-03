package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) return _puzzlePiece!!
        _puzzlePiece = phosphorBoldIcon(
            name = "PuzzlePiece",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.41f, 155.16f),
                    PathNode.CurveTo(218.92995f, 152.96288f, 214.56671f, 152.70244f, 210.85f, 154.47f),
                    PathNode.CurveTo(205.72768f, 156.91093f, 199.69571f, 156.45634f, 194.99709f, 153.27527f),
                    PathNode.CurveTo(190.29846f, 150.0942f, 187.6361f, 144.6625f, 188.0f, 139.0f),
                    PathNode.CurveTo(188.56322f, 131.03621f, 194.84448f, 124.67006f, 202.8f, 124.0f),
                    PathNode.CurveTo(205.55182f, 123.79417f, 208.30966f, 124.31126f, 210.8f, 125.5f),
                    PathNode.CurveTo(214.51607f, 127.28677f, 218.88924f, 127.04053f, 222.38123f, 124.84788f),
                    PathNode.CurveTo(225.87321f, 122.655235f, 227.99492f, 118.82331f, 228.0f, 114.7f),
                    PathNode.LineTo(228.0f, 72.0f),
                    PathNode.CurveTo(228.0f, 60.954304f, 219.0457f, 52.0f, 208.0f, 52.0f),
                    PathNode.LineTo(176.0f, 52.0f),
                    PathNode.CurveTo(175.98201f, 40.958183f, 171.4174f, 30.411135f, 163.38f, 22.84f),
                    PathNode.CurveTo(155.33832f, 15.233235f, 144.48413f, 11.332397f, 133.44f, 12.08f),
                    PathNode.CurveTo(113.51406f, 13.389357f, 97.59156f, 29.166874f, 96.1f, 49.08f),
                    PathNode.CurveTo(96.0f, 50.07f, 96.0f, 51.0f, 96.0f, 52.0f),
                    PathNode.LineTo(64.0f, 52.0f),
                    PathNode.CurveTo(52.954304f, 52.0f, 44.0f, 60.954304f, 44.0f, 72.0f),
                    PathNode.LineTo(44.0f, 100.0f),
                    PathNode.CurveTo(32.958183f, 100.01799f, 22.411135f, 104.58259f, 14.84f, 112.62f),
                    PathNode.CurveTo(4.279024f, 123.863914f, 1.124771f, 140.17862f, 6.733573f, 154.54877f),
                    PathNode.CurveTo(12.342375f, 168.91893f, 25.71453f, 178.78322f, 41.1f, 179.9f),
                    PathNode.CurveTo(42.06432f, 179.9829f, 43.03226f, 180.01628f, 44.0f, 180.0f),
                    PathNode.LineTo(44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 219.0457f, 52.954304f, 228.0f, 64.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 165.31f),
                    PathNode.CurveTo(228.00188f, 161.19159f, 225.89163f, 157.35992f, 222.41f, 155.16f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 204.0f),
                    PathNode.LineTo(68.0f, 204.0f),
                    PathNode.LineTo(68.0f, 165.31f),
                    PathNode.CurveTo(68.00044f, 161.19368f, 65.89101f, 157.3644f, 62.411476f, 155.16508f),
                    PathNode.CurveTo(58.93194f, 152.96577f, 54.567966f, 152.70341f, 50.85f, 154.47f),
                    PathNode.CurveTo(48.346424f, 155.67455f, 45.57092f, 156.20209f, 42.8f, 156.0f),
                    PathNode.CurveTo(34.865486f, 155.33388f, 28.591387f, 149.00043f, 28.0f, 141.06f),
                    PathNode.CurveTo(27.622936f, 135.39722f, 30.273884f, 129.95844f, 34.966736f, 126.7668f),
                    PathNode.CurveTo(39.659588f, 123.575165f, 45.691994f, 123.10835f, 50.82f, 125.54f),
                    PathNode.CurveTo(54.54068f, 127.32053f, 58.915066f, 127.06535f, 62.40348f, 124.86428f),
                    PathNode.CurveTo(65.89189f, 122.66321f, 68.00536f, 118.82477f, 68.0f, 114.7f),
                    PathNode.LineTo(68.0f, 76.0f),
                    PathNode.LineTo(110.7f, 76.0f),
                    PathNode.CurveTo(114.814545f, 75.99702f, 118.64068f, 73.8862f, 120.837585f, 70.40725f),
                    PathNode.CurveTo(123.03449f, 66.92831f, 123.29583f, 62.56636f, 121.53f, 58.85f),
                    PathNode.CurveTo(120.325455f, 56.346424f, 119.797935f, 53.57092f, 120.0f, 50.8f),
                    PathNode.CurveTo(120.66206f, 42.863598f, 126.99771f, 36.587315f, 134.94f, 36.0f),
                    PathNode.CurveTo(140.60173f, 35.62107f, 146.04063f, 38.269238f, 149.2341f, 42.959713f),
                    PathNode.CurveTo(152.42758f, 47.65019f, 152.89783f, 53.681213f, 150.47f, 58.81f),
                    PathNode.CurveTo(148.68481f, 62.53158f, 148.93759f, 66.90944f, 151.13925f, 70.400826f),
                    PathNode.CurveTo(153.34091f, 73.892204f, 157.1824f, 76.00702f, 161.31f, 76.0f),
                    PathNode.LineTo(204.0f, 76.0f),
                    PathNode.LineTo(204.0f, 100.0f),
                    PathNode.CurveTo(203.0f, 100.0f, 202.07f, 100.0f, 201.1f, 100.11f),
                    PathNode.CurveTo(179.6571f, 101.70316f, 163.31007f, 119.96325f, 164.09007f, 141.4511f),
                    PathNode.CurveTo(164.87009f, 162.93893f, 182.49803f, 179.96573f, 204.0f, 180.0f),
                    PathNode.LineTo(204.0f, 180.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
