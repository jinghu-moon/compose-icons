package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GoogleDriveLogo: ImageVector
    get() {
        if (_googleDriveLogo != null) return _googleDriveLogo!!
        _googleDriveLogo = phosphorThinIcon(
            name = "GoogleDriveLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.19f, 145.86f),
                    PathNode.LineTo(165.74f, 33.64f),
                    PathNode.CurveTo(163.5546f, 30.121569f, 159.70189f, 27.98706f, 155.56f, 28.0f),
                    PathNode.LineTo(100.43f, 28.0f),
                    PathNode.CurveTo(96.291176f, 27.988596f, 92.442154f, 30.123154f, 90.26f, 33.64f),
                    PathNode.LineTo(90.26f, 33.64f),
                    PathNode.LineTo(21.83f, 145.82f),
                    PathNode.CurveTo(19.483515f, 149.56706f, 19.387453f, 154.30084f, 21.58f, 158.14f),
                    PathNode.LineTo(48.91f, 206.0f),
                    PathNode.CurveTo(51.05675f, 209.71829f, 55.026493f, 212.00633f, 59.32f, 212.0f),
                    PathNode.LineTo(196.67f, 212.0f),
                    PathNode.CurveTo(200.96707f, 212.00992f, 204.94147f, 209.72139f, 207.09f, 206.0f),
                    PathNode.LineTo(234.41f, 158.19f),
                    PathNode.CurveTo(236.61566f, 154.3538f, 236.53111f, 149.61507f, 234.19f, 145.86f),
                    PathNode.Close,
                    PathNode.MoveTo(226.13f, 148.0f),
                    PathNode.LineTo(170.26f, 148.0f),
                    PathNode.LineTo(132.66f, 85.33f),
                    PathNode.LineTo(160.05f, 39.68f),
                    PathNode.Close,
                    PathNode.MoveTo(95.06f, 148.0f),
                    PathNode.LineTo(128.0f, 93.11f),
                    PathNode.LineTo(160.93f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(165.73f, 156.0f),
                    PathNode.LineTo(194.53f, 204.0f),
                    PathNode.LineTo(61.47f, 204.0f),
                    PathNode.LineTo(90.26f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 77.56f),
                    PathNode.LineTo(103.06f, 36.0f),
                    PathNode.LineTo(152.93f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(95.94f, 39.68f),
                    PathNode.LineTo(123.33f, 85.33f),
                    PathNode.LineTo(85.74f, 148.0f),
                    PathNode.LineTo(29.87f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(29.58f, 156.0f),
                    PathNode.LineTo(80.94f, 156.0f),
                    PathNode.LineTo(54.63f, 199.85f),
                    PathNode.Close,
                    PathNode.MoveTo(201.37f, 199.85f),
                    PathNode.LineTo(175.06f, 156.0f),
                    PathNode.LineTo(226.42f, 156.0f),
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
        return _googleDriveLogo!!
    }

private var _googleDriveLogo: ImageVector? = null
