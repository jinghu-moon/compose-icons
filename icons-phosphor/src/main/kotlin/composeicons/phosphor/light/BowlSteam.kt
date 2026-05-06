package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BowlSteam: ImageVector
    get() {
        if (_bowlSteam != null) return _bowlSteam!!
        _bowlSteam = phosphorLightIcon(
            name = "BowlSteam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 114h-192c-3.314 0-6 2.686-6 6 .073 38.465 21.705 73.641 56 91.06v4.94c0 7.732 6.268 14 14 14h64c7.732 0 14-6.268 14-14v-4.94C208.295 193.641 229.927 158.465 230 120c0-3.314-2.686-6-6-6ZM165.5 201.84c-2.131 .977-3.498 3.106-3.5 5.45v8.71c0 1.105-.895 2-2 2h-64c-1.105 0-2-.895-2-2v-8.71c-.002-2.344-1.369-4.473-3.5-5.45C60.52 188.014 40.468 158.937 38.2 126h179.6c-2.268 32.937-22.32 62.014-52.3 75.84ZM83.32 56.24c5.05-6.28 7.41-11.73 6.48-15-.72-2.53-3.64-3.57-3.67-3.58-2.739-.962-4.396-3.745-3.937-6.611C82.653 28.183 85.098 26.057 88 26c.604-.003 1.204 .088 1.78 .27 .91 .28 8.9 3 11.48 11.44 2.26 7.39-.63 16.15-8.58 26.05-5.05 6.28-7.41 11.73-6.48 15 .72 2.53 3.64 3.57 3.67 3.58 2.739 .962 4.396 3.745 3.937 6.611C93.347 91.817 90.902 93.943 88 94c-.604 .003-1.204-.088-1.78-.27-.91-.28-8.9-3-11.48-11.44-2.26-7.39 .63-16.15 8.58-26.05ZM123.32 56.24c5.05-6.28 7.41-11.73 6.48-15-.72-2.53-3.64-3.57-3.67-3.58-2.739-.962-4.396-3.745-3.937-6.611 .46-2.866 2.905-4.992 5.807-5.049 .604-.003 1.204 .088 1.78 .27 .91 .28 8.9 3 11.48 11.44 2.26 7.39-.63 16.15-8.58 26.05-5.05 6.28-7.41 11.73-6.48 15 .72 2.53 3.64 3.57 3.67 3.58 2.739 .962 4.396 3.745 3.937 6.611-.46 2.866-2.905 4.992-5.807 5.049-.604 .003-1.204-.088-1.78-.27-.91-.28-8.9-3-11.48-11.44-2.26-7.39 .63-16.15 8.58-26.05ZM163.32 56.24c5.05-6.28 7.41-11.73 6.48-15-.72-2.53-3.64-3.57-3.67-3.58-2.739-.962-4.396-3.745-3.937-6.611 .46-2.866 2.905-4.992 5.807-5.049 .604-.003 1.204 .088 1.78 .27 .91 .28 8.9 3 11.48 11.44 2.26 7.39-.63 16.15-8.58 26.05-5.05 6.28-7.41 11.73-6.48 15 .72 2.53 3.64 3.57 3.67 3.58 2.739 .962 4.396 3.745 3.937 6.611-.46 2.866-2.905 4.992-5.807 5.049-.604 .003-1.204-.088-1.78-.27-.91-.28-8.9-3-11.48-11.44-2.26-7.39 .63-16.15 8.58-26.05Z"),
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
        return _bowlSteam!!
    }

private var _bowlSteam: ImageVector? = null
