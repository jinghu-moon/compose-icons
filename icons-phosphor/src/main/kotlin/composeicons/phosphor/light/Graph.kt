package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Graph: ImageVector
    get() {
        if (_graph != null) return _graph!!
        _graph = phosphorLightIcon(
            name = "Graph",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 154c-7.156-.004-14.076 2.562-19.5 7.23L154.88 141.3c2.055-4.132 3.123-8.685 3.12-13.3-.002-1.203-.076-2.405-.22-3.6L174 119c7.511 13.048 23.53 18.508 37.446 12.764 13.917-5.744 21.42-20.913 17.541-35.46C225.108 81.756 211.047 72.338 196.119 74.285 181.19 76.233 170.017 88.945 170 104c.002 1.203 .076 2.405 .22 3.6L154 113C147.487 101.652 134.353 95.856 121.58 98.69L113.44 80.39c12.536-8.94 16.269-25.919 8.638-39.293C114.447 27.723 97.931 22.298 83.856 28.542 69.781 34.786 62.719 50.672 67.512 65.304c4.794 14.632 19.886 23.26 34.928 19.966l8.14 18.3C97.975 112.535 94.281 129.63 102.06 143L74 168c-12.361-9.254-29.721-7.646-40.171 3.722-10.45 11.367-10.596 28.801-.338 40.342 10.258 11.541 27.589 13.44 40.103 4.394C86.108 207.412 89.741 190.361 82 177l28-25c11.229 8.44 26.818 7.928 37.47-1.23l25.62 19.93c-5.939 12.009-3.197 26.5 6.721 35.508 9.917 9.007 24.605 10.347 35.989 3.283 11.383-7.064 16.703-20.82 13.034-33.706C225.165 162.899 213.397 154.009 200 154ZM200 86c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18ZM78 56C78 46.059 86.059 38 96 38c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18C86.059 74 78 65.941 78 56ZM56 210c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM128 146c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM200 202c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18Z"),
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
