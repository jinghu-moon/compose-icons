package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Graph: ImageVector
    get() {
        if (_graph != null) return _graph!!
        _graph = phosphorBoldIcon(
            name = "Graph",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 152c-5.728-.004-11.373 1.368-16.46 4L162.15 139.36c1.163-3.454 1.787-7.066 1.85-10.71l10.35-3.44c12.072 12.259 31.132 14.262 45.489 4.78 14.357-9.481 19.998-27.797 13.464-43.713C226.768 70.361 209.885 61.293 193.007 64.635 176.13 67.977 163.976 82.795 164 100c0 1.11 .06 2.21 .16 3.3l-7.78 2.59C149.566 97.134 139.095 92.009 128 92c-1 0-1.88 0-2.81 .12l-4.45-10c12.528-11.883 14.855-30.988 5.545-45.53C116.975 22.047 98.651 16.163 82.615 22.567 66.579 28.971 57.348 45.859 60.617 62.815 63.886 79.77 78.733 92.016 96 92c1 0 1.88 0 2.81-.12l4.45 10c-10.792 10.187-14.205 25.963-8.59 39.7L73.39 160.49c-15.351-8.474-34.574-4.655-45.52 9.042-10.947 13.697-10.432 33.289 1.218 46.394 11.65 13.104 31.047 15.909 45.932 6.642 14.885-9.267 20.928-27.911 14.311-44.148l21.28-18.91c11.556 6.395 25.689 5.93 36.8-1.21L167 173.56c-6.386 14.585-2.434 31.632 9.719 41.918 12.153 10.286 29.619 11.368 42.948 2.66 13.329-8.708 19.355-25.138 14.817-40.399C229.946 162.478 215.922 152.01 200 152ZM200 88c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM84 56C84 49.373 89.373 44 96 44c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12C89.373 68 84 62.627 84 56ZM56 204c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM116 128c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM200 200c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _graph!!
    }

private var _graph: ImageVector? = null
