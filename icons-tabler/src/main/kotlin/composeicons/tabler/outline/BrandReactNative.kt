package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandReactNative: ImageVector
    get() {
        if (_brandReactNative != null) return _brandReactNative!!
        _brandReactNative = tablerOutlineIcon(
            name = "BrandReactNative",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.357 9C3.72 9.68 2 10.845 2 12.175 2 14.282 6.405 16 11.85 16c.74 0 1.26-.039 1.95-.097")
            addPathData("M9.837 15.9C9.424 15.304 9.031 14.767 8.657 14.1 5.906 9.2 5.169 4.33 7.027 3.227c1.15-.697 3.047 .253 4.974 2.254")
            addPathData("M6.429 15.387c-.702 2.688-.56 4.716 .56 5.395 1.783 1.08 5.387-1.958 8.043-6.804 .36-.67 .683-1.329 .968-1.978")
            addPathData("M12 18.52c1.928 2 3.817 2.95 4.978 2.253C18.828 19.671 18.099 14.801 15.345 9.9 14.961 9.223 14.568 8.696 14.165 8.1")
            addPathData("M17.66 15C20.272 14.313 22 13.15 22 11.824 22 9.714 17.592 8 12.155 8c-.747 0-1.266 .029-1.955 .087")
            addPathData("M8 12c.285-.66 .607-1.308 .968-1.978C11.615 5.178 15.221 2.132 17.014 3.221c1.11 .679 1.262 2.706 .56 5.393")
            addPathData("M12.26 12.015h-.01c-.01 .13-.12 .24-.26 .24-.139-.007-.249-.121-.25-.26 0-.14 .11-.25 .24-.25h-.01c.13-.01 .25 .11 .25 .24")
        }
        return _brandReactNative!!
    }

private var _brandReactNative: ImageVector? = null
